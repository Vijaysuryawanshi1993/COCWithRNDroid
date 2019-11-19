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

public class BestWarWinFragment extends Fragment {

    private RecyclerView recyclerViewBestWar;
    private RelativeLayout layoutViewBestWar;
    private List<RankingListModels> list;
    private LegendLeagueAdapter adapter;

    public BestWarWinFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static BestWarWinFragment newInstance() {
        BestWarWinFragment fragment = new BestWarWinFragment();
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
        return inflater.inflate(R.layout.fragment_best_war_win, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        onClick();
    }

    private void init(View view) {
        layoutViewBestWar = (RelativeLayout) view.findViewById(R.id.layoutViewBestWar);
        recyclerViewBestWar = (RecyclerView) view.findViewById(R.id.recyclerViewBestWar);

        list = new ArrayList<>();
        adapter = new LegendLeagueAdapter(getContext(), list, "BestWar");
        recyclerViewBestWar.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerViewBestWar.setItemAnimator(new DefaultItemAnimator());
        recyclerViewBestWar.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        listItems();
    }

    private void listItems() {
        RankingListModels models = new RankingListModels(1, "Harshal", "#123545", 2123);
        list.add(models);
        RankingListModels models1 = new RankingListModels(2, "Vishal", "#615516", 3154);
        list.add(models1);
        RankingListModels models2 = new RankingListModels(3, "DJ", "#984651", 2532);
        list.add(models2);
    }

    private void onClick() {
        layoutViewBestWar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), TrophyDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}
