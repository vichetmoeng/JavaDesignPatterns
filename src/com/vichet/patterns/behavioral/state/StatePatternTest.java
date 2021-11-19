package com.vichet.patterns.behavioral.state;

public class StatePatternTest {
    public static void main(String[] args) {
        SeasonContext seasonContext = new SeasonContext();
        seasonContext.nextSeason();
        seasonContext.nextSeason();
        seasonContext.nextSeason();

        seasonContext.nextSeason();
        seasonContext.nextSeason();
        seasonContext.nextSeason();

        System.out.println("");
        System.out.println("Setting current season to Monsoon");
        seasonContext.setSeason(new Monsoon());
        seasonContext.nextSeason();
        seasonContext.nextSeason();
        seasonContext.nextSeason();

        seasonContext.nextSeason();
        seasonContext.nextSeason();
        seasonContext.nextSeason();
    }
}
