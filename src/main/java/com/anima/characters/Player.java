package com.anima.characters;

import com.anima.base.Actor;

public class Player implements Actor {
    PrimaryStatsComponent primaryStatsComponent = null;
    public Player() {
    
    }
    
    @Override
    public void setPrimaryStats(PrimaryStatsComponent stats) {
        primaryStatsComponent = stats;
    }
    
    @Override
    public PrimaryStatsComponent getPrimaryStats() {
        return primaryStatsComponent;
    }
}
