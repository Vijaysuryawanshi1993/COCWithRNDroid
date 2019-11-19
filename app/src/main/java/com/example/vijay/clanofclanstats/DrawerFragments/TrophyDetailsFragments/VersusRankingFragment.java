package com.example.vijay.clanofclanstats.DrawerFragments.TrophyDetailsFragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vijay.clanofclanstats.R;

public class VersusRankingFragment extends Fragment {

    public VersusRankingFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static VersusRankingFragment newInstance() {
        VersusRankingFragment fragment = new VersusRankingFragment();
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
        return inflater.inflate(R.layout.fragment_versus_ranking, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        onClick(view);
    }

    private void init(View view) {

    }

    private void onClick(View view) {

    }
}
