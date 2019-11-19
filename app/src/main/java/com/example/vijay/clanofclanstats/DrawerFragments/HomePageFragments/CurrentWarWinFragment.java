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

public class CurrentWarWinFragment extends Fragment {

    private RelativeLayout layoutViewMoreCurrentWar;
    private RecyclerView recyclerViewCurrentWar;
    List<RankingListModels> list;
    private LegendLeagueAdapter adapter;

    public CurrentWarWinFragment() {
        // Required empty public constructor
    }


    public static CurrentWarWinFragment newInstance() {
        CurrentWarWinFragment fragment = new CurrentWarWinFragment();
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
        return inflater.inflate(R.layout.fragment_current_war_win, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        onClick();
    }

    private void init(View view) {
        layoutViewMoreCurrentWar = (RelativeLayout) view.findViewById(R.id.layoutViewMoreCurrentWar);
        recyclerViewCurrentWar = (RecyclerView) view.findViewById(R.id.recyclerViewCurrentWar);

        list = new ArrayList<>();
        adapter = new LegendLeagueAdapter(getContext(), list, "CurrentWar");
        recyclerViewCurrentWar.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerViewCurrentWar.setItemAnimator(new DefaultItemAnimator());
        recyclerViewCurrentWar.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        listItems();
    }

    private void listItems() {
        RankingListModels listModels = new RankingListModels(1, "Abhay", "#1354SJS", 2154);
        list.add(listModels);
        RankingListModels listModels1 = new RankingListModels(2, "Pawle", "#35432", 2120);
        list.add(listModels1);
        RankingListModels listModels2 = new RankingListModels(3, "Surya", "#DFG1fdg", 3151);
        list.add(listModels2);
    }

    private void onClick() {
        layoutViewMoreCurrentWar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), TrophyDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}
