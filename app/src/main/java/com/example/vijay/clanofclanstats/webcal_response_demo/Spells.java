package com.example.vijay.clanofclanstats.webcal_response_demo;

import com.google.gson.annotations.SerializedName;

public class Spells {
    @SerializedName("name")
    public String name;
    @SerializedName("level")
    public int level;
    @SerializedName("maxLevel")
    public int maxLevel;
    @SerializedName("village")
    public String village;

    public String getName() {
        return name;
    }

    public void setName(String s_name) {
        this.name = s_name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }
}
