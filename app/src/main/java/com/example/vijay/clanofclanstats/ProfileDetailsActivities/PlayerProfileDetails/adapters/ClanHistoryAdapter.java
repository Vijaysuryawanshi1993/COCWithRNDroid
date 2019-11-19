package com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.models.ClanHistoryModel;
import com.example.vijay.clanofclanstats.R;

import java.util.List;

/**
 * Created by surya on 27-06-2017.
 */

public class ClanHistoryAdapter extends RecyclerView.Adapter<ClanHistoryAdapter.mViewHolder> {
    Context context;
    List<ClanHistoryModel> model;

    public ClanHistoryAdapter(Context context, List<ClanHistoryModel> list) {
        this.context = context;
        this.model = list;
    }


    @Override
    public mViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.clan_history_list_item, viewGroup, false);
        return new ClanHistoryAdapter.mViewHolder(view);
    }

    @Override
    public void onBindViewHolder(mViewHolder viewHolder, int i) {
        ClanHistoryModel list = model.get(i);
        viewHolder.textClanName.setText(list.getClanName());
        viewHolder.textClanTag.setText(list.getClanTag());
        viewHolder.textDate.setText("From " + list.getFromDate() + " to " + list.getToDate());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    class mViewHolder extends RecyclerView.ViewHolder {
        private final TextView textDate;
        private final TextView textClanName;
        private final TextView textClanTag;

        public mViewHolder(View itemView) {
            super(itemView);
            textClanName = (TextView) itemView.findViewById(R.id.textClanName);
            textClanTag = (TextView) itemView.findViewById(R.id.textClanTag);
            textDate = (TextView) itemView.findViewById(R.id.textDate);
        }
    }
}

