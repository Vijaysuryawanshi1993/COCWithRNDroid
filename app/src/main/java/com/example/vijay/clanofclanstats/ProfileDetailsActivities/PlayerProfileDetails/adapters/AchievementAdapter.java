package com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.adapters;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.models.AchievementModel;
import com.example.vijay.clanofclanstats.R;

import java.util.List;

/**
 * Created by surya on 27-06-2017.
 */

public class AchievementAdapter extends RecyclerView.Adapter<AchievementAdapter.mViewHolder> {
    Context context;
    List<AchievementModel> model;

    public AchievementAdapter(Context context, List<AchievementModel> list) {
        this.context = context;
        this.model = list;
    }


    @Override
    public mViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.achievement_list_item, viewGroup, false);
        return new mViewHolder(view);
    }

    @Override
    public void onBindViewHolder(mViewHolder viewHolder, int i) {
        AchievementModel list = model.get(i);
        viewHolder.editTextProgress.setText(list.getOutOfProgress().trim() + "/" + list.getActualProgress().trim());
        viewHolder.editTextProgressOuter.setHint(list.getHeading().trim());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    class mViewHolder extends RecyclerView.ViewHolder {
        private final EditText editTextProgress;
        private final TextInputLayout editTextProgressOuter;

        public mViewHolder(View itemView) {
            super(itemView);
            editTextProgress = (EditText) itemView.findViewById(R.id.editTextProgress);
            editTextProgressOuter = (TextInputLayout) itemView.findViewById(R.id.editTextProgressOuter);
        }
    }
}

