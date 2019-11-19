package com.example.vijay.clanofclanstats.webcal_response_demo;

import com.google.gson.annotations.SerializedName;

public class Clan {
    @SerializedName("tag")
    public String tag;
    @SerializedName("name")
    public String name;
    @SerializedName("clanLevel")
    public int clanLevel;
    @SerializedName("badgeUrls")
    public BadgeUrls badgeUrls;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String c_name) {
        this.name = c_name;
    }

    public int getClanLevel() {
        return clanLevel;
    }

    public void setClanLevel(int clanLevel) {
        this.clanLevel = clanLevel;
    }

    public BadgeUrls getBadgeUrls() {
        return badgeUrls;
    }

    public void setBadgeUrls(BadgeUrls badgeUrls) {
        this.badgeUrls = badgeUrls;
    }
}
