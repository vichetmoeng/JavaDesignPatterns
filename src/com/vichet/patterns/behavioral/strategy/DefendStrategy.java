package com.vichet.patterns.behavioral.strategy;

public class DefendStrategy implements TeamStrategy{
    @Override
    public void play(String team) {
        System.out.println(team + " will play in defensive mode.");
    }
}
