package com.example.vijay.clanofclanstats.DrawerFragments.TrophyDetailsFragments.TrophyRankingDetails;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vijay.clanofclanstats.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClanRankDetailsFragment extends Fragment {


    public ClanRankDetailsFragment() {
        // Required empty public constructor
    }

    public static ClanRankDetailsFragment newInstance() {
        ClanRankDetailsFragment fragment = new ClanRankDetailsFragment();

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_clan_rank_details, container, false);
    }

}
