package com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.models;

/**
 * Created by surya on 27-06-2017.
 */

public class AchievementModel {
    private String heading;
    private String actualProgress;
    private String outOfProgress;
    private String stars;

    public AchievementModel() {
    }

    public AchievementModel(String heading, String actualProgress, String outOfProgress, String stars) {
        this.heading = heading;
        this.actualProgress = actualProgress;
        this.outOfProgress = outOfProgress;
        this.stars = stars;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getActualProgress() {
        return actualProgress;
    }

    public void setActualProgress(String actualProgress) {
        this.actualProgress = actualProgress;
    }

    public String getOutOfProgress() {
        return outOfProgress;
    }

    public void setOutOfProgress(String outOfProgress) {
        this.outOfProgress = outOfProgress;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "AchievementModel{" +
                "heading='" + heading + '\'' +
                ", actualProgress='" + actualProgress + '\'' +
                ", outOfProgress='" + outOfProgress + '\'' +
                ", stars='" + stars + '\'' +
                '}';
    }
}
