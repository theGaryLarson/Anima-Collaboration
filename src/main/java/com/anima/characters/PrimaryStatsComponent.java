package com.anima.characters;

import com.anima.generation.StatsMap;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;


/**
 * Holds primary stat data and contains logic dealing with primary stats
 */
public class PrimaryStatsComponent {
    private StatsMap<String, Integer> primaryStats;
    
    public PrimaryStatsComponent() {
        try {
            init();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    
    private void init() throws FileNotFoundException {
        
        // this implementation restricts adding new keys accidentally
        HashMap<String, Integer> readPrimaryStats = new HashMap<>();
        Gson gson = new Gson();
        FileReader reader = new FileReader("src/main/resources/json/primaryStats.json");
        //todo: read the primary stats from json and load into the StatsMap
        primaryStats = new StatsMap<>(readPrimaryStats);
    }
    
    public int getStat(String primary) {
            return primaryStats.get(primary);
        }
}
