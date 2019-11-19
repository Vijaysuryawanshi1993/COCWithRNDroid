package com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.adapters.AchievementAdapter;
import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.adapters.ClanHistoryAdapter;
import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.adapters.ProgressAdapter;
import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.models.AchievementModel;
import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.models.ClanHistoryModel;
import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.models.ProgressModel;
import com.example.vijay.clanofclanstats.R;

import java.util.ArrayList;
import java.util.List;

public class PPDRemainingFragment extends Fragment {
    private RecyclerView recyclerViewAchievement;
    private RecyclerView recyclerViewClanHistory;
    private RecyclerView recyclerViewProgressLog;

    private List<AchievementModel> list;
    private AchievementAdapter adapter;

    private List<ClanHistoryModel> listClanHistory;
    private ClanHistoryAdapter adapterClanHistory;

    private List<ProgressModel> listProgress;
    private ProgressAdapter adapterProgress;

    public static PPDRemainingFragment newInstance() {
        PPDRemainingFragment fragment = new PPDRemainingFragment();
        return fragment;
    }

    public PPDRemainingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ppdremaining, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
    }

    private void init(View view) {
        recyclerViewAchievement = (RecyclerView) view.findViewById(R.id.recyclerViewAchievement);
        recyclerViewProgressLog = (RecyclerView) view.findViewById(R.id.recyclerViewProgressLog);
        recyclerViewClanHistory = (RecyclerView) view.findViewById(R.id.recyclerViewClanHistory);

        list = new ArrayList<>();
        listProgress = new ArrayList<>();
        listClanHistory = new ArrayList<>();

        adapter = new AchievementAdapter(getContext(), list);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerViewAchievement.setLayoutManager(mLayoutManager);
        recyclerViewAchievement.setItemAnimator(new DefaultItemAnimator());
        recyclerViewAchievement.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        AchievementData();

        adapterProgress = new ProgressAdapter(getContext(), listProgress);
        RecyclerView.LayoutManager mLayoutManager1 = new GridLayoutManager(getContext(), 1);
        recyclerViewProgressLog.setLayoutManager(mLayoutManager1);
        recyclerViewProgressLog.setItemAnimator(new DefaultItemAnimator());
        recyclerViewProgressLog.setAdapter(adapterProgress);
        adapterProgress.notifyDataSetChanged();
        ProgressData();

        adapterClanHistory = new ClanHistoryAdapter(getContext(), listClanHistory);
        RecyclerView.LayoutManager mLayoutManager2 = new GridLayoutManager(getContext(), 1);
        recyclerViewClanHistory.setLayoutManager(mLayoutManager2);
        recyclerViewClanHistory.setItemAnimator(new DefaultItemAnimator());
        recyclerViewClanHistory.setAdapter(adapterClanHistory);
        adapterClanHistory.notifyDataSetChanged();
        ClanHistoryData();

    }

    private void ClanHistoryData() {
        for (int i = 0; i < 5; i++) {
            ClanHistoryModel users = new ClanHistoryModel("Jai Maharashta", "#12315FSA", "12/05/2016", "27/06/2017", R.mipmap.badge);
            listClanHistory.add(users);
        }
    }

    private void ProgressData() {
        for (int i = 0; i < 5; i++) {
            ProgressModel users = new ProgressModel("20/12/2016", "Hog Rider", "Level 5", R.mipmap.barberian);
            listProgress.add(users);
        }
    }

    private void AchievementData() {
        for (int i = 0; i < 5; i++) {
            AchievementModel users = new AchievementModel("Bigger Coffers", "10", "12", "3");
            list.add(users);
            AchievementModel users1 = new AchievementModel("Goblin Fire", "11", "15", "2");
            list.add(users1);
        }
    }
}

