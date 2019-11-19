package com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.adapters.ClanHistoryAdapter;
import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.adapters.TroopsAdapter;
import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.models.TroopsImagesModel;
import com.example.vijay.clanofclanstats.R;
import com.example.vijay.clanofclanstats.api_calls.APIServiceFactory;
import com.example.vijay.clanofclanstats.api_calls.PlayersService;
import com.example.vijay.clanofclanstats.webcal_response_demo.PlayerDetailResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PlayerProfileDetailsFragment extends Fragment {

    private RecyclerView recyclerViewBuilderBase;
    private RecyclerView recyclerViewSpells;
    private RecyclerView recyclerViewTroops;
    private RecyclerView recyclerViewHeroes;
    private List<TroopsImagesModel> listTroops;

    private List<TroopsImagesModel> listSpells;

    private List<TroopsImagesModel> listHeroes;

    private List<TroopsImagesModel> listBuilderBase;
    private TroopsAdapter adapter;

    PlayerDetailResponse model;
    private TextView text_town_hall;
    private TextView text_builder_hall;
    private TextView text_playerName;
    private EditText et_level;
    private EditText et_bestTrophies;
    private EditText et_Trophies;
    private EditText et_warStar;
    private EditText et_attackWins;
    private EditText et_defenceWin;
    private EditText et_troopsDonated;
    private EditText et_troopsReceived;
    private EditText et_versusTrophies;
    private EditText et_versusBattleWins;
    private TextView text_clanName;

    public static PlayerProfileDetailsFragment newInstance() {
        PlayerProfileDetailsFragment fragment = new PlayerProfileDetailsFragment();
        return fragment;
    }

    public PlayerProfileDetailsFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_player_profile_details, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
    }

    private void init(View view) {
        getRemainderDetails(getContext());

        Fragment fragment = new PPDRemainingFragment().newInstance();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.containerPlayerDetailsRemaining, fragment);
        fragmentTransaction.commit();


        text_town_hall = (TextView) view.findViewById(R.id.text_town_hall);
        text_builder_hall = (TextView) view.findViewById(R.id.text_builder_hall);
        text_playerName = (TextView) view.findViewById(R.id.text_playerName);
        et_level = (EditText) view.findViewById(R.id.et_level);
        et_bestTrophies = (EditText) view.findViewById(R.id.et_bestTrophies);
        et_Trophies = (EditText) view.findViewById(R.id.et_trophies);
        et_warStar = (EditText) view.findViewById(R.id.et_warStar);
        et_attackWins = (EditText) view.findViewById(R.id.et_attackWins);
        et_defenceWin = (EditText) view.findViewById(R.id.et_defenceWin);
        et_troopsDonated = (EditText) view.findViewById(R.id.et_troopsDonated);
        et_troopsReceived = (EditText) view.findViewById(R.id.et_troopsReceived);
        et_versusTrophies = (EditText) view.findViewById(R.id.et_versusTrophies);
        et_versusBattleWins = (EditText) view.findViewById(R.id.et_versusBattleWins);

        text_clanName = (TextView) view.findViewById(R.id.text_clanName);


        recyclerViewTroops = (RecyclerView) view.findViewById(R.id.recyclerViewTroops);
        recyclerViewSpells = (RecyclerView) view.findViewById(R.id.recyclerViewSpells);
        recyclerViewHeroes = (RecyclerView) view.findViewById(R.id.recyclerViewHeroes);
        recyclerViewBuilderBase = (RecyclerView) view.findViewById(R.id.recyclerViewBuilderBase);

        listTroops = new ArrayList<>();
        listSpells = new ArrayList<>();
        listHeroes = new ArrayList<>();
        listBuilderBase = new ArrayList<>();


        adapter = new TroopsAdapter(getContext(), listTroops);
        recyclerViewTroops.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
        recyclerViewTroops.setItemAnimator(new DefaultItemAnimator());
        recyclerViewTroops.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        adapter = new TroopsAdapter(getContext(), listSpells);
        recyclerViewSpells.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
        recyclerViewSpells.setItemAnimator(new DefaultItemAnimator());
        recyclerViewSpells.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        adapter = new TroopsAdapter(getContext(), listHeroes);
        recyclerViewHeroes.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
        recyclerViewHeroes.setItemAnimator(new DefaultItemAnimator());
        recyclerViewHeroes.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        adapter = new TroopsAdapter(getContext(), listBuilderBase);
        recyclerViewBuilderBase.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));
        recyclerViewBuilderBase.setItemAnimator(new DefaultItemAnimator());
        recyclerViewBuilderBase.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }

    private void getRemainderDetails(Context mContext) {
        PlayersService playersService = APIServiceFactory.createService(PlayersService.class, mContext);
        Call<PlayerDetailResponse> call = playersService.getPlayers();

        String url = call.request().url().toString();
        call.enqueue(new Callback<PlayerDetailResponse>() {
            @Override
            public void onResponse(Call<PlayerDetailResponse> call, Response<PlayerDetailResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    model = response.body();
                    setValues(model);
                } else {
                    try {
                        Toast.makeText(getContext(), response.errorBody().string(), Toast.LENGTH_SHORT).show();
                        Log.e("Error", response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<PlayerDetailResponse> call, Throwable t) {

            }
        });
    }

    private void setValues(PlayerDetailResponse model) {
        try {
            text_town_hall.setText("Town Hall " + model.getTownHallLevel());
            text_builder_hall.setText("Builder Hall " + model.getBuilderHallLevel());
            text_playerName.setText(model.getName());
            et_level.setText(String.valueOf(model.getExpLevel()));
            et_bestTrophies.setText(String.valueOf(model.getBestTrophies()));
            et_Trophies.setText(String.valueOf(model.getTrophies()));
            et_warStar.setText(String.valueOf(model.getWarStars()));
            et_attackWins.setText(String.valueOf(model.getAttackWins()));
            et_defenceWin.setText(String.valueOf(model.getDefenseWins()));
            et_troopsDonated.setText(String.valueOf(model.getDonations()));
            et_troopsReceived.setText(String.valueOf(model.getDonationsReceived()));
            et_versusTrophies.setText(String.valueOf(model.getVersusTrophies()));
            et_versusBattleWins.setText(String.valueOf(model.getVersusBattleWins()));
            text_clanName.setText(model.getClan().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
