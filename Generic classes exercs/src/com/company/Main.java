package com.company;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League("AFL");
        Team<FootballPlayer> adelaideCrows = new Team("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team("Melbourne");
        Team<FootballPlayer> hawthorn = new Team("Hawthorn");
        Team<FootballPlayer> fremantle = new Team("Fremantle");
        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        footballLeague.add(adelaideCrows);
        footballLeague.add(hawthorn);
        footballLeague.add(melbourne);
        footballLeague.add(fremantle);
        footballLeague.showLeagueTable();
    }
}
