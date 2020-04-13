package com.company;

public class Main {

    public static void main(String[] args) {
        FootballPlayer footballPlayer_1 = new FootballPlayer("FootPlayer");
        BaseballPlayer baseballPlayer_1 = new BaseballPlayer("BasePlayer");
        SoccerPlayer soccerPlayer_1 = new SoccerPlayer("SoccPlayer");

        Team <FootballPlayer> team_1 = new Team<>("Team_1");
        team_1.addPlayer(footballPlayer_1);
//        team_1.addPlayer(baseballPlayer_1);
//        team_1.addPlayer(soccerPlayer_1);

        System.out.println(team_1.numPlayers());

        Team<BaseballPlayer> team_2 = new Team<>("Team_2");
        team_2.addPlayer(baseballPlayer_1);

        Team<SoccerPlayer> team_3 = new Team<>("Team_3");
        team_3.addPlayer(soccerPlayer_1);

        Team<FootballPlayer> team_4 = new Team<>("Team_4");
        FootballPlayer footballPlayer_2 = new FootballPlayer("FootPlayer");
        team_4.addPlayer(footballPlayer_2);

        team_1.matchResult(team_4 , 2 ,5);
        team_3.matchResult(team_3 , 5 , 3);

        System.out.println(team_1.compareTo(team_4));
        System.out.println(team_4.compareTo(team_1));


    }
}
