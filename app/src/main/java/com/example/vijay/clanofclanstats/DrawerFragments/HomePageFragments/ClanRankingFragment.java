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

public class ClanRankingFragment extends Fragment {


    private RelativeLayout layoutViewMoreClanRanking;
    private RecyclerView recyclerViewClanRanking;
    List<RankingListModels> list;
    LegendLeagueAdapter adapter;


    public ClanRankingFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ClanRankingFragment newInstance() {
        ClanRankingFragment fragment = new ClanRankingFragment();

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
        return inflater.inflate(R.layout.fragment_clan_ranking, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        onClick(view);
    }


    private void init(View view) {
        recyclerViewClanRanking = (RecyclerView) view.findViewById(R.id.recyclerViewClanRanking);
        layoutViewMoreClanRanking = (RelativeLayout) view.findViewById(R.id.layoutViewMoreClanRanking);
        list = new ArrayList<>();
        adapter = new LegendLeagueAdapter(getContext(), list, "ClanRankings");
        recyclerViewClanRanking.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerViewClanRanking.setItemAnimator(new DefaultItemAnimator());
        recyclerViewClanRanking.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        listItems();

    }

    private void listItems() {
        RankingListModels models = new RankingListModels(1, "Jayesh", "#1315DD", 3214);
        list.add(models);
        RankingListModels models1 = new RankingListModels(2, "Pranav", "#SDFSDF", 6155);
        list.add(models1);
        RankingListModels models2 = new RankingListModels(3, "Vibh", "#SD1221", 1231);
        list.add(models2);
    }

    private void onClick(View view) {
        layoutViewMoreClanRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), TrophyDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}
