package com.example.vijay.clanofclanstats.webcal_response_demo;

import com.google.gson.annotations.SerializedName;

public class Achievements {
    @SerializedName("name")
    public String name;
    @SerializedName("stars")
    public int stars;
    @SerializedName("value")
    public int value;
    @SerializedName("target")
    public int target;
    @SerializedName("info")
    public String info;
    @SerializedName("completionInfo")
    public String completionInfo;
    @SerializedName("village")
    public String village;

    public String getName() {
        return name;
    }

    public void setName(String mname) {
        this.name = mname;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCompletionInfo() {
        return completionInfo;
    }

    public void setCompletionInfo(String completionInfo) {
        this.completionInfo = completionInfo;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }
}
