package com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vijay.clanofclanstats.R;

public class PlayerProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_profile);
        init();
        onClick();
    }

    private void init() {
        Fragment fragment = new PlayerProfileDetailsFragment().newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayoutPlayerProfileDetails, fragment);
        fragmentTransaction.commit();
    }

    private void onClick() {

    }
}
