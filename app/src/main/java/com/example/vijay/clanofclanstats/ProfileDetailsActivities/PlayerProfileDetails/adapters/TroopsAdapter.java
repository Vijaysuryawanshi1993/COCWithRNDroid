package com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.models.TroopsImagesModel;
import com.example.vijay.clanofclanstats.R;

import java.util.List;

/**
 * Created by surya on 28-06-2017.
 */

public class TroopsAdapter extends RecyclerView.Adapter<TroopsAdapter.mViewHolder> {
    Context context;
    List<TroopsImagesModel> model;

    public TroopsAdapter(Context context, List<TroopsImagesModel> list) {
        this.context = context;
        this.model = list;
    }


    @Override
    public mViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.troops_images_item, viewGroup, false);
        return new mViewHolder(view);

    }

    @Override
    public void onBindViewHolder(mViewHolder viewHolder, int i) {
        TroopsImagesModel list = model.get(i);
        viewHolder.imageViewTroops.setImageDrawable(ContextCompat.getDrawable(context, list.getImages()));
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    class mViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageViewTroops;

        public mViewHolder(View itemView) {
            super(itemView);
            imageViewTroops = (ImageView) itemView.findViewById(R.id.imageViewTroops);
        }
    }
}