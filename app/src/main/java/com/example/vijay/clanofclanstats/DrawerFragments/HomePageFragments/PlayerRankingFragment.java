package com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.adapters.LegendLeagueAdapter;
import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.models.RankingListModels;
import com.example.vijay.clanofclanstats.MainActivity.TrophyDetailsActivity;
import com.example.vijay.clanofclanstats.R;

import java.util.ArrayList;
import java.util.List;


public class PlayerRankingFragment extends Fragment {

    private RecyclerView recyclerViewPlayerRanking;
    private RelativeLayout layoutViewMorePlayerRanking;
    private List<RankingListModels> list;
    private LegendLeagueAdapter adapter;

    public PlayerRankingFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static PlayerRankingFragment newInstance() {
        PlayerRankingFragment fragment = new PlayerRankingFragment();
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
        return inflater.inflate(R.layout.fragment_player_ranking, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        onClick(view);
    }

    private void init(View view) {
        layoutViewMorePlayerRanking = (RelativeLayout) view.findViewById(R.id.layoutViewMorePlayerRanking);
        recyclerViewPlayerRanking = (RecyclerView) view.findViewById(R.id.recyclerViewPlayerRanking);

        list = new ArrayList<>();
        adapter = new LegendLeagueAdapter(getContext(), list, "PlayerRanking");
        recyclerViewPlayerRanking.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerViewPlayerRanking.setItemAnimator(new DefaultItemAnimator());
        recyclerViewPlayerRanking.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        listItems();

    }

    private void listItems() {
        RankingListModels listModels = new RankingListModels(1, "Raj", "#312351", 3123);
        list.add(listModels);
        RankingListModels listModels1 = new RankingListModels(2, "Rani", "#A2ADAd", 1515);
        list.add(listModels1);
        RankingListModels listModels2 = new RankingListModels(3, "Raju", "#ADF231", 6161);
        list.add(listModels2);
    }

    private void onClick(View view) {
        layoutViewMorePlayerRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), TrophyDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}
