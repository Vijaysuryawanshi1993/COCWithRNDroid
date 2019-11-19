package com.example.vijay.clanofclanstats.DrawerFragments.TrophyDetailsFragments.TrophyRankingDetails;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.vijay.clanofclanstats.R;


public class LegendLeagueDetailsFragment extends Fragment {

    private RecyclerView recyclerViewLegend;
    private LinearLayout tabLegendTrophies;

    public LegendLeagueDetailsFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static LegendLeagueDetailsFragment newInstance() {
        LegendLeagueDetailsFragment fragment = new LegendLeagueDetailsFragment();
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
        return inflater.inflate(R.layout.fragment_legend_league_details, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        onClick(view);
    }

    private void init(View view) {
        recyclerViewLegend = (RecyclerView) view.findViewById(R.id.recyclerViewLegend);
        tabLegendTrophies = (LinearLayout) view.findViewById(R.id.tabLegendTrophies);
    }

    private void onClick(View view) {

    }
}
