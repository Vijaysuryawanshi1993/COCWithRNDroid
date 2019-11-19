package com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.models.ProgressModel;
import com.example.vijay.clanofclanstats.R;

import java.util.List;

/**
 * Created by surya on 27-06-2017.
 */

public class ProgressAdapter extends RecyclerView.Adapter<ProgressAdapter.mViewHolder> {
    Context context;
    List<ProgressModel> model;

    public ProgressAdapter(Context context, List<ProgressModel> list) {
        this.context = context;
        this.model = list;
    }


    @Override
    public mViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.progress_list_item, viewGroup, false);
        return new mViewHolder(view);

    }

    @Override
    public void onBindViewHolder(mViewHolder viewHolder, int i) {
        ProgressModel list = model.get(i);
        viewHolder.textViewDate.setText(list.getDate());
        viewHolder.textViewDetails.setText(list.getName() + " upgraded to " + list.getLevel());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    class mViewHolder extends RecyclerView.ViewHolder {

        private final TextView textViewDate;
        private final TextView textViewDetails;

        public mViewHolder(View itemView) {
            super(itemView);
            textViewDate = (TextView) itemView.findViewById(R.id.textViewDate);
            textViewDetails = (TextView) itemView.findViewById(R.id.textViewDetails);
        }
    }
}
