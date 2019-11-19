package com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.models.RankingListModels;
import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.PlayerProfileActivity;
import com.example.vijay.clanofclanstats.R;

import java.util.List;

/**
 * Created by Vijay on 26-09-2017.
 */

public class LegendLeagueAdapter extends RecyclerView.Adapter<LegendLeagueAdapter.mViewHolder> {
    Context context;
    List<RankingListModels> model;
    String From;


    public LegendLeagueAdapter(Context context, List<RankingListModels> list, String from) {
        this.context = context;
        this.model = list;
        this.From = from;
    }

    @Override
    public mViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_ranking_list_item, viewGroup, false);
        return new LegendLeagueAdapter.mViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final mViewHolder viewHolder, int i) {
        RankingListModels list = model.get(i);

        if (From.equals("LegendLeague")) {
            viewHolder.text_id.setText(String.valueOf(list.getId()));
            viewHolder.textName.setText(list.getName());
            viewHolder.textTag.setText(list.getTag());
            viewHolder.image_trophy.setVisibility(View.VISIBLE);
            viewHolder.textWinNumber.setText(String.valueOf(list.getTrophies()));
            viewHolder.layoutTotal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, PlayerProfileActivity.class);
                    context.startActivity(intent);
                }
            });

        } else if (From.equals("Player")) {
            viewHolder.text_id.setText(String.valueOf(list.getId()));
            viewHolder.textName.setText(list.getName());
            viewHolder.textTag.setText(list.getTag());
            viewHolder.image_trophy.setVisibility(View.GONE);
            viewHolder.textWinNumber.setText(String.valueOf(list.getTrophies()));
            viewHolder.textWinNumber.setTextColor(Color.BLACK);
            viewHolder.layoutTotal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, PlayerProfileActivity.class);
                    context.startActivity(intent);
                }
            });

        } else if (From.equals("Clan")) {
            viewHolder.text_id.setText(String.valueOf(list.getId()));
            viewHolder.textName.setText(list.getName());
            viewHolder.textTag.setText(list.getTag());
            viewHolder.image_trophy.setVisibility(View.GONE);
            viewHolder.textWinNumber.setText(String.valueOf(list.getTrophies()));
            viewHolder.textWinNumber.setTextColor(Color.BLACK);
            viewHolder.layoutTotal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, PlayerProfileActivity.class);
                    context.startActivity(intent);
                }
            });
        } else if (From.equals("CurrentWar")) {
            viewHolder.text_id.setText(String.valueOf(list.getId()));
            viewHolder.textName.setText(list.getName());
            viewHolder.textTag.setText(list.getTag());
            viewHolder.image_trophy.setVisibility(View.GONE);
            viewHolder.textWinNumber.setText(String.valueOf(list.getTrophies()));
            viewHolder.textWinNumber.setTextColor(Color.BLACK);
            viewHolder.layoutTotal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, PlayerProfileActivity.class);
                    context.startActivity(intent);
                }
            });
        } else if (From.equals("BestWar")) {
            viewHolder.text_id.setText(String.valueOf(list.getId()));
            viewHolder.textName.setText(list.getName());
            viewHolder.textTag.setText(list.getTag());
            viewHolder.image_trophy.setVisibility(View.GONE);
            viewHolder.textWinNumber.setText(String.valueOf(list.getTrophies()));
            viewHolder.textWinNumber.setTextColor(Color.BLACK);
        } else if (From.equals("TotalWarWin")) {
            viewHolder.text_id.setText(String.valueOf(list.getId()));
            viewHolder.textName.setText(list.getName());
            viewHolder.textTag.setText(list.getTag());
            viewHolder.image_trophy.setVisibility(View.GONE);
            viewHolder.textWinNumber.setText(String.valueOf(list.getTrophies()));
            viewHolder.textWinNumber.setTextColor(Color.BLACK);
        } else if (From.equals("PlayerRanking")) {
            viewHolder.text_id.setText(String.valueOf(list.getId()));
            viewHolder.textName.setText(list.getName());
            viewHolder.textTag.setText(list.getTag());
            viewHolder.textWinNumber.setText(String.valueOf(list.getTrophies()));
            viewHolder.textWinNumber.setTextColor(Color.BLACK);
        } else if (From.equals("ClanRankings")) {
            viewHolder.text_id.setText(String.valueOf(list.getId()));
            viewHolder.textName.setText(list.getName());
            viewHolder.textTag.setText(list.getTag());
            viewHolder.textWinNumber.setText(String.valueOf(list.getTrophies()));
            viewHolder.textWinNumber.setTextColor(Color.BLACK);
        }
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    class mViewHolder extends RecyclerView.ViewHolder {
        private final TextView text_id;
        private final TextView textName;
        private final TextView textTag;
        private final ImageView image_trophy;
        private final TextView textWinNumber;
        private final ImageView search;
        private final LinearLayout layoutTotal;

        public mViewHolder(View itemView) {
            super(itemView);
            layoutTotal = (LinearLayout) itemView.findViewById(R.id.layoutTotal);
            text_id = (TextView) itemView.findViewById(R.id.text_id);
            textName = (TextView) itemView.findViewById(R.id.textName);
            textTag = (TextView) itemView.findViewById(R.id.textTag);
            image_trophy = (ImageView) itemView.findViewById(R.id.image_trophy);
            textWinNumber = (TextView) itemView.findViewById(R.id.textWinNumber);
            search = (ImageView) itemView.findViewById(R.id.search1);
        }
    }
}
