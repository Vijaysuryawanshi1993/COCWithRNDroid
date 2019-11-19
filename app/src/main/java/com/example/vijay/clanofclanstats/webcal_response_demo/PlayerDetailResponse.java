package com.example.vijay.clanofclanstats.webcal_response_demo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by surya on 26-06-2017.
 */

public class PlayerDetailResponse {

    @SerializedName("tag")
    public String tag;
    @SerializedName("name")
    public String name;
    @SerializedName("townHallLevel")
    public int townHallLevel;
    @SerializedName("expLevel")
    public int expLevel;
    @SerializedName("trophies")
    public int trophies;
    @SerializedName("bestTrophies")
    public int bestTrophies;
    @SerializedName("warStars")
    public int warStars;
    @SerializedName("attackWins")
    public int attackWins;
    @SerializedName("defenseWins")
    public int defenseWins;
    @SerializedName("builderHallLevel")
    public int builderHallLevel;
    @SerializedName("versusTrophies")
    public int versusTrophies;
    @SerializedName("bestVersusTrophies")
    public int bestVersusTrophies;
    @SerializedName("versusBattleWins")
    public int versusBattleWins;
    @SerializedName("role")
    public String role;
    @SerializedName("donations")
    public int donations;
    @SerializedName("donationsReceived")
    public int donationsReceived;
    @SerializedName("clan")
    public Clan clan;
    @SerializedName("achievements")
    public List<Achievements> achievements;
    @SerializedName("versusBattleWinCount")
    public int versusBattleWinCount;
    @SerializedName("troops")
    public List<Troops> troops;
    @SerializedName("heroes")
    public List<Heroes> heroes;
    @SerializedName("spells")
    public List<Spells> spells;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String p_name) {
        this.name = p_name;
    }

    public int getTownHallLevel() {
        return townHallLevel;
    }

    public void setTownHallLevel(int townHallLevel) {
        this.townHallLevel = townHallLevel;
    }

    public int getExpLevel() {
        return expLevel;
    }

    public void setExpLevel(int expLevel) {
        this.expLevel = expLevel;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public int getBestTrophies() {
        return bestTrophies;
    }

    public void setBestTrophies(int bestTrophies) {
        this.bestTrophies = bestTrophies;
    }

    public int getWarStars() {
        return warStars;
    }

    public void setWarStars(int warStars) {
        this.warStars = warStars;
    }

    public int getAttackWins() {
        return attackWins;
    }

    public void setAttackWins(int attackWins) {
        this.attackWins = attackWins;
    }

    public int getDefenseWins() {
        return defenseWins;
    }

    public void setDefenseWins(int defenseWins) {
        this.defenseWins = defenseWins;
    }

    public int getBuilderHallLevel() {
        return builderHallLevel;
    }

    public void setBuilderHallLevel(int builderHallLevel) {
        this.builderHallLevel = builderHallLevel;
    }

    public int getVersusTrophies() {
        return versusTrophies;
    }

    public void setVersusTrophies(int versusTrophies) {
        this.versusTrophies = versusTrophies;
    }

    public int getBestVersusTrophies() {
        return bestVersusTrophies;
    }

    public void setBestVersusTrophies(int bestVersusTrophies) {
        this.bestVersusTrophies = bestVersusTrophies;
    }

    public int getVersusBattleWins() {
        return versusBattleWins;
    }

    public void setVersusBattleWins(int versusBattleWins) {
        this.versusBattleWins = versusBattleWins;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getDonations() {
        return donations;
    }

    public void setDonations(int donations) {
        this.donations = donations;
    }

    public int getDonationsReceived() {
        return donationsReceived;
    }

    public void setDonationsReceived(int donationsReceived) {
        this.donationsReceived = donationsReceived;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public List<Achievements> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievements> achievements) {
        this.achievements = achievements;
    }

    public int getVersusBattleWinCount() {
        return versusBattleWinCount;
    }

    public void setVersusBattleWinCount(int versusBattleWinCount) {
        this.versusBattleWinCount = versusBattleWinCount;
    }

    public List<Troops> getTroops() {
        return troops;
    }

    public void setTroops(List<Troops> troops) {
        this.troops = troops;
    }

    public List<Heroes> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<Heroes> heroes) {
        this.heroes = heroes;
    }

    public List<Spells> getSpells() {
        return spells;
    }

    public void setSpells(List<Spells> spells) {
        this.spells = spells;
    }


}
