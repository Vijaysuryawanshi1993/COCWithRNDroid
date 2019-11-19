package com.example.vijay.clanofclanstats.DrawerFragments.HomeFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.BestWarWinFragment;
import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.ClanFragment;
import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.ClanRankingFragment;
import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.CurrentWarWinFragment;
import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.LegendLeagueFragment;
import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.PlayerFragment;
import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.PlayerRankingFragment;
import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.TotalWarWinFragment;
import com.example.vijay.clanofclanstats.R;


public class HomeFragment extends Fragment {

    private SearchView searchView;
    private TextView tabClan;
    private TextView tabPlayer;
    private TextView tabLegendLeague;
    private ViewPager viewPagerTrophiesRanking;
    private TextView tabCurrentWarWin;
    private TextView tabBestWarWin;
    private TextView tabTotalWarWin;
    private ViewPager viewPagerWarRanking;
    private ViewPager viewPagerVersusRanking;
    private TextView tabPlayersRanking;
    private TextView tabClanRanking;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
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
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        onClick(view);
    }

    private void init(View view) {
        searchView = (SearchView) view.findViewById(R.id.searchView);

        tabLegendLeague = (TextView) view.findViewById(R.id.tabLegendLeague);
        tabPlayer = (TextView) view.findViewById(R.id.tabPlayer);
        tabClan = (TextView) view.findViewById(R.id.tabClan);
        viewPagerTrophiesRanking = (ViewPager) view.findViewById(R.id.viewPagerTrophiesRanking);

        tabCurrentWarWin = (TextView) view.findViewById(R.id.tabCurrentWarWin);
        tabBestWarWin = (TextView) view.findViewById(R.id.tabBestWarWin);
        tabTotalWarWin = (TextView) view.findViewById(R.id.tabTotalWarWin);
        viewPagerWarRanking = (ViewPager) view.findViewById(R.id.viewPagerWarRanking);

        tabPlayersRanking = (TextView) view.findViewById(R.id.tabPlayersRanking);
        tabClanRanking = (TextView) view.findViewById(R.id.tabClanRanking);
        viewPagerVersusRanking = (ViewPager) view.findViewById(R.id.viewPagerVersusRanking);

        viewPagerTrophiesRanking.setAdapter(new MyPagerAdapter(getFragmentManager()));
        viewPagerWarRanking.setAdapter(new MyPagerAdapter1(getFragmentManager()));
        viewPagerVersusRanking.setAdapter(new MyPagerAdapter2(getFragmentManager()));

        Tab_onClick(0);
        Tab_onClick1(0);
        Tab_onClick2(0);

    }

    private void onClick(View view) {

        tabLegendLeague.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tab_onClick(0);
                viewPagerTrophiesRanking.setCurrentItem(0, true);
            }
        });
        tabPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tab_onClick(1);
                viewPagerTrophiesRanking.setCurrentItem(1, true);
            }
        });
        tabClan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Tab_onClick(2);
                viewPagerTrophiesRanking.setCurrentItem(2, true);
            }
        });


        tabCurrentWarWin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tab_onClick1(0);
                viewPagerWarRanking.setCurrentItem(0, true);
            }
        });
        tabBestWarWin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tab_onClick1(1);
                viewPagerWarRanking.setCurrentItem(1, true);
            }
        });
        tabTotalWarWin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Tab_onClick1(2);
                viewPagerWarRanking.setCurrentItem(2, true);
            }
        });


        tabPlayersRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tab_onClick2(0);
                viewPagerVersusRanking.setCurrentItem(0, true);
            }
        });

        tabClanRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tab_onClick2(1);
                viewPagerVersusRanking.setCurrentItem(1, true);
            }
        });


        viewPagerTrophiesRanking.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {

                switch (position) {
                    case 0:
                        Tab_onClick(position);
                        break;
                    case 1:
                        Tab_onClick(position);
                        break;
                    case 2:
                        Tab_onClick(position);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });

        viewPagerWarRanking.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {

                switch (position) {
                    case 0:
                        Tab_onClick1(position);
                        break;
                    case 1:
                        Tab_onClick1(position);
                        break;
                    case 2:
                        Tab_onClick1(position);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });

        viewPagerVersusRanking.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {

                switch (position) {
                    case 0:
                        Tab_onClick2(position);
                        break;
                    case 1:
                        Tab_onClick2(position);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });

    }


    private class MyPagerAdapter extends FragmentStatePagerAdapter {
        //
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            Fragment fragment = null;
            switch (pos) {
                case 0:
                    LegendLeagueFragment legendLeagueTropthies = new LegendLeagueFragment().newInstance();
                    return legendLeagueTropthies;
                case 1:
                    PlayerFragment playerFragment = new PlayerFragment().newInstance();
                    return playerFragment;
                case 2:
                    ClanFragment clanFragment = new ClanFragment().newInstance();
                    return clanFragment;

            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }


    public void Tab_onClick(int position) {
        if (position == 0) {
            tabLegendLeague.setBackgroundResource(R.color.white);
            tabLegendLeague.setTextColor(getResources().getColor(R.color.purple));

            tabPlayer.setBackgroundResource(R.color.divider);
            tabPlayer.setTextColor(getResources().getColor(R.color.black));

            tabClan.setBackgroundResource(R.color.divider);
            tabClan.setTextColor(getResources().getColor(R.color.black));
        }

        if (position == 1) {
            tabLegendLeague.setBackgroundResource(R.color.divider);
            tabLegendLeague.setTextColor(getResources().getColor(R.color.black));

            tabPlayer.setBackgroundResource(R.color.white);
            tabPlayer.setTextColor(getResources().getColor(R.color.blue));

            tabClan.setBackgroundResource(R.color.divider);
            tabClan.setTextColor(getResources().getColor(R.color.black));
        }

        if (position == 2) {
            tabLegendLeague.setBackgroundResource(R.color.divider);
            tabLegendLeague.setTextColor(getResources().getColor(R.color.black));

            tabPlayer.setBackgroundResource(R.color.divider);
            tabPlayer.setTextColor(getResources().getColor(R.color.black));

            tabClan.setBackgroundResource(R.color.white);
            tabClan.setTextColor(getResources().getColor(R.color.blue));
        }
    }


    private class MyPagerAdapter1 extends FragmentStatePagerAdapter {
        //
        public MyPagerAdapter1(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            Fragment fragment = null;
            switch (pos) {
                case 0:
                    CurrentWarWinFragment currentWarWinFragment = new CurrentWarWinFragment().newInstance();
                    return currentWarWinFragment;
                case 1:
                    BestWarWinFragment bestWarWinFragment = new BestWarWinFragment().newInstance();
                    return bestWarWinFragment;
                case 2:
                    TotalWarWinFragment totalWarWinFragment = new TotalWarWinFragment().newInstance();
                    return totalWarWinFragment;

            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }


    public void Tab_onClick1(int position) {
        if (position == 0) {
            tabCurrentWarWin.setBackgroundResource(R.color.white);
            tabCurrentWarWin.setTextColor(getResources().getColor(R.color.blue));

            tabBestWarWin.setBackgroundResource(R.color.divider);
            tabBestWarWin.setTextColor(getResources().getColor(R.color.black));

            tabTotalWarWin.setBackgroundResource(R.color.divider);
            tabTotalWarWin.setTextColor(getResources().getColor(R.color.black));
        }

        if (position == 1) {
            tabCurrentWarWin.setBackgroundResource(R.color.divider);
            tabCurrentWarWin.setTextColor(getResources().getColor(R.color.black));

            tabBestWarWin.setBackgroundResource(R.color.white);
            tabBestWarWin.setTextColor(getResources().getColor(R.color.blue));

            tabTotalWarWin.setBackgroundResource(R.color.divider);
            tabTotalWarWin.setTextColor(getResources().getColor(R.color.black));
        }

        if (position == 2) {
            tabCurrentWarWin.setBackgroundResource(R.color.divider);
            tabCurrentWarWin.setTextColor(getResources().getColor(R.color.black));

            tabBestWarWin.setBackgroundResource(R.color.divider);
            tabBestWarWin.setTextColor(getResources().getColor(R.color.black));

            tabTotalWarWin.setBackgroundResource(R.color.white);
            tabTotalWarWin.setTextColor(getResources().getColor(R.color.blue));
        }
    }


    private class MyPagerAdapter2 extends FragmentStatePagerAdapter {
        //
        public MyPagerAdapter2(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            Fragment fragment = null;
            switch (pos) {
                case 0:
                    PlayerRankingFragment playerRankingFragment = new PlayerRankingFragment().newInstance();
                    return playerRankingFragment;
                case 1:
                    ClanRankingFragment clanRankingFragment = new ClanRankingFragment().newInstance();
                    return clanRankingFragment;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }


    public void Tab_onClick2(int position) {
        if (position == 0) {
            tabPlayersRanking.setBackgroundResource(R.color.white);
            tabPlayersRanking.setTextColor(getResources().getColor(R.color.blue));

            tabClanRanking.setBackgroundResource(R.color.divider);
            tabClanRanking.setTextColor(getResources().getColor(R.color.black));
        }

        if (position == 1) {
            tabPlayersRanking.setBackgroundResource(R.color.divider);
            tabPlayersRanking.setTextColor(getResources().getColor(R.color.black));

            tabClanRanking.setBackgroundResource(R.color.white);
            tabClanRanking.setTextColor(getResources().getColor(R.color.blue));

        }

    }

}
