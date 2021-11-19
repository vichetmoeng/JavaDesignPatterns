package com.vichet.patterns.behavioral.state;

public class Winter implements Season{
    @Override
    public void nextSeason(SeasonContext seasonContext) {
        System.out.println("Winter season is running ...");
        // base on condition season (state) changes...
        seasonContext.setSeason(new Summer());
    }
}
