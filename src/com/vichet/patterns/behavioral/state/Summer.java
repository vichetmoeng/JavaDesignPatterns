package com.vichet.patterns.behavioral.state;

public class Summer implements Season{
    @Override
    public void nextSeason(SeasonContext seasonContext) {
        System.out.println("Summer season is running ...");
        // base on condition season (state) changes...
        seasonContext.setSeason(new Monsoon());
    }
}
