package com.example.vijay.clanofclanstats.DrawerFragments.HomePageFragments.models;

/**
 * Created by Vijay on 26-09-2017.
 */

public class RankingListModels {
    public RankingListModels(int id, String name, String tag, int trophies) {
        this.id = id;
        this.name = name;
        this.tag = tag;
        this.trophies = trophies;
    }

    private int id;
    private String name;
    private String tag;
    private int trophies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }
}
