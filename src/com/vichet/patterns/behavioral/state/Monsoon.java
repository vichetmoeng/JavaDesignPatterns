package com.vichet.patterns.behavioral.state;

public class Monsoon implements Season{
    @Override
    public void nextSeason(SeasonContext seasonContext) {
        System.out.println("Monsoon season is running ...");
        // base on condition season (state) changes...
        seasonContext.setSeason(new Winter());
    }
}
