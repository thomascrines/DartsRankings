package com.example.user.dartsrankings;

/**
 * Created by user on 07/11/2016.
 */

public class Player {

    private String name;
    private String nickname;
    private int ranking;

    public Player(String name, String nickname, int ranking) {
        this.name = name;
        this.nickname = nickname;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int ranking() {
        return ranking;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setNickname(String newNickname) {
        this.nickname = newNickname;
    }

    public void setRanking(int newRanking) {
        this.ranking = newRanking;
    }

    public String toString() {
        return "Name: " + this.name + ", Nickname: " + this.nickname + ", Ranking: " + this.ranking + ".";
    }

}
