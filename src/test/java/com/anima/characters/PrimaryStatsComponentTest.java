package com.anima.characters;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimaryStatsComponentTest {
    
    @Test
    void getSetStat() {
        PrimaryStatsComponent stats = new PrimaryStatsComponent();
        assertEquals(0, stats.getStat("Strength"));
        stats.setStat("Strength", 10);
        assertEquals(10, stats.getStat("Strength"));
        assertThrows(UnsupportedOperationException.class, () -> stats.setStat(
                "nonexistentStat", 99));
    }
}