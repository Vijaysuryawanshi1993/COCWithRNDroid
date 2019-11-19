package com.example.vijay.clanofclanstats.ProfileDetailsActivities.PlayerProfileDetails.models;

/**
 * Created by surya on 27-06-2017.
 */

public class ClanHistoryModel {
    private String clanName;
    private String clanTag;
    private String fromDate;
    private String toDate;
    private int clanLogo;

    public ClanHistoryModel(String clanName, String clanTag, String fromDate, String toDate, int clanLogo) {
        this.clanName = clanName;
        this.clanTag = clanTag;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.clanLogo = clanLogo;
    }

    public String getClanName() {
        return clanName;
    }

    public void setClanName(String clanName) {
        this.clanName = clanName;
    }

    public String getClanTag() {
        return clanTag;
    }

    public void setClanTag(String clanTag) {
        this.clanTag = clanTag;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public int getClanLogo() {
        return clanLogo;
    }

    public void setClanLogo(int clanLogo) {
        this.clanLogo = clanLogo;
    }

    @Override
    public String toString() {
        return "ClanHistoryModel{" +
                "clanName='" + clanName + '\'' +
                ", clanTag='" + clanTag + '\'' +
                ", fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", clanLogo=" + clanLogo +
                '}';
    }

}
