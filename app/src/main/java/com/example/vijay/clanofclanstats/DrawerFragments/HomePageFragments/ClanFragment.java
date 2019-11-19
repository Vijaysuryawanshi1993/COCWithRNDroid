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


public class ClanFragment extends Fragment {

    private RelativeLayout layoutViewMoreClan;
    private RecyclerView recyclerViewClan;
    private List<RankingListModels> list;
    private LegendLeagueAdapter adapter;


    public ClanFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ClanFragment newInstance() {
        ClanFragment fragment = new ClanFragment();
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
        return inflater.inflate(R.layout.fragment_clan, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        onClick();
    }

    private void init(View view) {
        layoutViewMoreClan = (RelativeLayout) view.findViewById(R.id.layoutViewMoreClan);
        recyclerViewClan = (RecyclerView) view.findViewById(R.id.recyclerViewClan);

        list = new ArrayList<>();
        adapter = new LegendLeagueAdapter(getContext(), list, "Clan");
        recyclerViewClan.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerViewClan.setItemAnimator(new DefaultItemAnimator());
        recyclerViewClan.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        listItems();
    }

    private void listItems() {
        RankingListModels models = new RankingListModels(1, "Yash", "#13541SF", 3215);
        list.add(models);
        RankingListModels models1 = new RankingListModels(2, "Palya", "#SFAFSD1", 3214);
        list.add(models1);
        RankingListModels models2 = new RankingListModels(3, "Manoj", "#AFADFA1", 1321);
        list.add(models2);

    }

    private void onClick() {
        layoutViewMoreClan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), TrophyDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}
