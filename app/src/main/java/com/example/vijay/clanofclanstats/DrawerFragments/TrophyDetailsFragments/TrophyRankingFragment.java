package com.example.vijay.clanofclanstats.DrawerFragments.TrophyDetailsFragments;

import android.app.FragmentManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.vijay.clanofclanstats.DrawerFragments.TrophyDetailsFragments.TrophyRankingDetails.ClanRankDetailsFragment;
import com.example.vijay.clanofclanstats.DrawerFragments.TrophyDetailsFragments.TrophyRankingDetails.LegendLeagueDetailsFragment;
import com.example.vijay.clanofclanstats.DrawerFragments.TrophyDetailsFragments.TrophyRankingDetails.PlayerRankDetailsFragment;
import com.example.vijay.clanofclanstats.R;

public class TrophyRankingFragment extends Fragment {

    private LinearLayout tabLegendLeague;
    private LinearLayout tabPlayersRanking;
    private LinearLayout tabClanRanking;
    private Fragment fragment;
    private android.support.v4.app.FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    public TrophyRankingFragment() {
        // Required empty public constructor
    }


    public static TrophyRankingFragment newInstance() {
        TrophyRankingFragment fragment = new TrophyRankingFragment();
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
        return inflater.inflate(R.layout.fragment_trophy_ranking, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        onClick(view);
    }

    private void init(View view) {
        tabLegendLeague = (LinearLayout) view.findViewById(R.id.tabLegendLeague);
        tabPlayersRanking = (LinearLayout) view.findViewById(R.id.tabPlayersRanking);
        tabClanRanking = (LinearLayout) view.findViewById(R.id.tabClanRanking);

        fragment = new LegendLeagueDetailsFragment().newInstance();
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_body1, fragment);
        fragmentTransaction.commit();
    }

    private void onClick(View view) {
        tabClanRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new ClanRankDetailsFragment().newInstance();
                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container_body1, fragment);
                fragmentTransaction.commit();
            }
        });

        tabLegendLeague.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new LegendLeagueDetailsFragment().newInstance();
                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container_body1, fragment);
                fragmentTransaction.commit();
            }
        });

        tabPlayersRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new PlayerRankDetailsFragment().newInstance();
                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container_body1, fragment);
                fragmentTransaction.commit();
            }
        });
    }
}
