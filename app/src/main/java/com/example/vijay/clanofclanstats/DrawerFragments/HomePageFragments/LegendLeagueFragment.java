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
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.adapters.LegendLeagueAdapter;
import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.models.RankingListModels;
import com.example.vijay.clanofclanstats.MainActivity.TrophyDetailsActivity;
import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.PlayerProfileActivity;
import com.example.vijay.clanofclanstats.R;

import java.util.ArrayList;
import java.util.List;


public class LegendLeagueFragment extends Fragment {


    private RelativeLayout layoutViewMore;
    private RecyclerView recyclerViewLegendLeague;
    private List<RankingListModels> list;
    private LegendLeagueAdapter adapter;

    public LegendLeagueFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static LegendLeagueFragment newInstance() {
        LegendLeagueFragment fragment = new LegendLeagueFragment();
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
        return inflater.inflate(R.layout.fragment_legend_league, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        onClick(view);
    }

    private void init(View view) {
        recyclerViewLegendLeague = (RecyclerView) view.findViewById(R.id.recyclerViewLegendLeague);
        layoutViewMore = (RelativeLayout) view.findViewById(R.id.layoutViewMore);
        list = new ArrayList<>();
        adapter = new LegendLeagueAdapter(getContext(), list, "LegendLeague");
        recyclerViewLegendLeague.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerViewLegendLeague.setItemAnimator(new DefaultItemAnimator());
        recyclerViewLegendLeague.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        listItems();


    }

    private void listItems() {
        RankingListModels listModels = new RankingListModels(1, "Vijay", "#1354SJS", 2154);
        list.add(listModels);
        RankingListModels listModels1 = new RankingListModels(2, "Ajay", "#35432", 2120);
        list.add(listModels1);
        RankingListModels listModels2 = new RankingListModels(3, "Palash", "#DFG1fdg", 3151);
        list.add(listModels2);

    }

    private void onClick(View view) {
        layoutViewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), TrophyDetailsActivity.class);
                startActivity(intent);
            }
        });

    }
}
