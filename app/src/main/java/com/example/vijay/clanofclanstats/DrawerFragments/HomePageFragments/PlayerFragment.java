package com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.adapters.LegendLeagueAdapter;
import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.models.RankingListModels;
import com.example.vijay.clanofclanstats.MainActivity.TrophyDetailsActivity;
import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.PlayerProfileActivity;
import com.example.vijay.clanofclanstats.R;

import java.util.ArrayList;
import java.util.List;


public class PlayerFragment extends Fragment {


    private RecyclerView recyclerViewPlayer;
    private RelativeLayout layoutViewMorePlayer;

    private List<RankingListModels> list;
    private LegendLeagueAdapter adapter;

    public PlayerFragment() {
        // Required empty public constructor
    }


    public static PlayerFragment newInstance() {
        PlayerFragment fragment = new PlayerFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_player, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        onClick(view);
    }

    private void init(View view) {
        recyclerViewPlayer = (RecyclerView) view.findViewById(R.id.recyclerViewPlayer);
        layoutViewMorePlayer = (RelativeLayout) view.findViewById(R.id.layoutViewMorePlayer);
        list = new ArrayList<>();
        adapter = new LegendLeagueAdapter(getContext(), list, "Player");
        recyclerViewPlayer.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerViewPlayer.setItemAnimator(new DefaultItemAnimator());
        recyclerViewPlayer.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        listItems();
    }

    private void onClick(View view) {
        layoutViewMorePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), TrophyDetailsActivity.class);
                startActivity(intent);
            }
        });
    }


    private void listItems() {
        RankingListModels listModels = new RankingListModels(1, "Prashant", "#1354SJS", 3214);
        list.add(listModels);
        RankingListModels listModels1 = new RankingListModels(2, "Jay", "#1354SJS", 3155);
        list.add(listModels1);
        RankingListModels listModels2 = new RankingListModels(3, "Shash", "#1354SJS", 3125);
        list.add(listModels2);

    }
}
