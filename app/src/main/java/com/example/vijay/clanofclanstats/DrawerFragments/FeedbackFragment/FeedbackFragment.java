package com.example.vijay.clanofclanstats.DrawerFragments.FeedbackFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vijay.clanofclanstats.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FeedbackFragment extends Fragment {
    public static FeedbackFragment newInstance() {
        FeedbackFragment fragment = new FeedbackFragment();
        return fragment;
    }

    public FeedbackFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feedback, container, false);
    }

}
