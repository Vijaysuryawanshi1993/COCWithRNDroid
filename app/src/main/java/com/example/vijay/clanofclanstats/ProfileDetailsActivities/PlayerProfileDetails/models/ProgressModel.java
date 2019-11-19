package com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.models;


public class ProgressModel {
    private String date;
    private String name;
    private String level;
    private int image;

    public ProgressModel() {
    }

    public ProgressModel(String date, String name, String level, int image) {
        this.date = date;
        this.name = name;
        this.level = level;
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ProgressModel{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", image=" + image +
                '}';
    }
}
