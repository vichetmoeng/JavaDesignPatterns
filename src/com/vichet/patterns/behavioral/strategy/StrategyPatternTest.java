package com.vichet.patterns.behavioral.strategy;

public class StrategyPatternTest {
    public static void main(String[] args) {
        // teams
        Team teamKhmer = new TeamKhmer();
        Team teamCambodia = new TeamCambodia();
        teamKhmer.setTeamName("Khmer");
        teamCambodia.setTeamName("Cambodia");

        // get teams info
        teamKhmer.teamInfo();
        teamCambodia.teamInfo();

        // strategies
        TeamStrategy attack = new AttackStrategy();
        TeamStrategy defend = new DefendStrategy();
        System.out.println("******************************************************");

        // Khmer start game with defensive mode.
        // Cambodia start game with attacking mode.
        teamKhmer.setTeamStrategy(defend);
        teamCambodia.setTeamStrategy(attack);

        // start play
        teamKhmer.playGame();
        teamCambodia.playGame();

        // after half-time ************************
        // change strategies
        System.out.println("******************************************************");


        // Khmer start game with attacking mode.
        // Cambodia start game with defensive mode.
        teamKhmer.setTeamStrategy(attack);
        teamCambodia.setTeamStrategy(defend);


        // start play again
        teamKhmer.playGame();
        teamCambodia.playGame();


    }
}
