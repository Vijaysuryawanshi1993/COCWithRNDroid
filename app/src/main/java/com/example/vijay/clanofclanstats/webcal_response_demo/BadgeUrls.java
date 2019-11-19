package com.example.vijay.clanofclanstats.webcal_response_demo;

import com.google.gson.annotations.SerializedName;

public class BadgeUrls {
    @SerializedName("small")
    public String small;
    @SerializedName("large")
    public String large;
    @SerializedName("medium")
    public String medium;


    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }
}
