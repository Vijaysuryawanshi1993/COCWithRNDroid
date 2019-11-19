package com.example.vijay.clanofclanstats.MainActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.vijay.clanofclanstats.DrawerFragments.TrophyDetailsFragments.TrophyRankingFragment;
import com.example.vijay.clanofclanstats.DrawerFragments.TrophyDetailsFragments.VersusRankingFragment;
import com.example.vijay.clanofclanstats.DrawerFragments.TrophyDetailsFragments.WarRankingFragment;
import com.example.vijay.clanofclanstats.R;

public class TrophyDetailsActivity extends AppCompatActivity {

    private RelativeLayout tabTrophyRanking;
    private RelativeLayout tabWarRanking;
    private RelativeLayout tabVersusRanking;
    private Fragment fragment;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trophy_details);
        init();
        onClick();
    }

    private void init() {
        tabTrophyRanking = (RelativeLayout) findViewById(R.id.tabTrophyRanking);
        tabWarRanking = (RelativeLayout) findViewById(R.id.tabWarRanking);
        tabVersusRanking = (RelativeLayout) findViewById(R.id.tabVersusRanking);

        fragment = new TrophyRankingFragment().newInstance();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_body, fragment);
        fragmentTransaction.commit();
    }

    private void onClick() {
        tabTrophyRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tabTrophyRanking.setBackgroundResource(R.color.blue);
                tabWarRanking.setBackgroundResource(R.color.blue_faint);
                tabVersusRanking.setBackgroundResource(R.color.blue_faint);

                fragment = new TrophyRankingFragment().newInstance();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container_body, fragment);
                fragmentTransaction.commit();
            }
        });

        tabWarRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tabWarRanking.setBackgroundResource(R.color.blue);
                tabTrophyRanking.setBackgroundResource(R.color.blue_faint);
                tabVersusRanking.setBackgroundResource(R.color.blue_faint);

                fragment = new WarRankingFragment().newInstance();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container_body, fragment);
                fragmentTransaction.commit();
            }
        });

        tabVersusRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tabVersusRanking.setBackgroundResource(R.color.blue);
                tabTrophyRanking.setBackgroundResource(R.color.blue_faint);
                tabWarRanking.setBackgroundResource(R.color.blue_faint);

                fragment = new VersusRankingFragment().newInstance();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container_body, fragment);
                fragmentTransaction.commit();
            }
        });
    }
}
