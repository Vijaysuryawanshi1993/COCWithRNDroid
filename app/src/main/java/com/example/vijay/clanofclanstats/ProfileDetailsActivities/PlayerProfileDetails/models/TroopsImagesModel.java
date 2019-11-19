package com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.models;

/**
 * Created by surya on 28-06-2017.
 */

public class TroopsImagesModel {
    private int images;

    public TroopsImagesModel(int images) {
        this.images = images;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "TroopsImagesModel{" +
                "images=" + images +
                '}';
    }
}
