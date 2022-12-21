package com.anima.base;

import com.anima.characters.PrimaryStatsComponent;

public interface Actor {
    void setPrimaryStats(PrimaryStatsComponent stats);
    PrimaryStatsComponent getPrimaryStats();
}
