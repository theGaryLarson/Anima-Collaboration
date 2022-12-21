package com.anima.characters;

import com.anima.generation.StatsMap;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;


/**
 * Holds primary stat data and contains logic dealing with primary stats
 */
public class PrimaryStatsComponent {
    private StatsMap<String, Integer> primaryStats;
    
    public PrimaryStatsComponent() {
        init();
    }
    
    private void init(){
        
        // this implementation restricts adding new keys accidentally
        HashMap<String, Integer> readPrimaryStats = new HashMap<>();
        Gson gson = new Gson();
        FileReader reader;
        try {
            reader = new FileReader("src/main/resources/json/primaryStats.json");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //todo: read the primary stats from json and load into the StatsMap
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
        JsonArray primaryStatsArray = jsonObject.getAsJsonArray("primaryStats");
        for (JsonElement stat : primaryStatsArray) {
            readPrimaryStats.put(stat.getAsString(), 0);
        }
        primaryStats = new StatsMap<>(readPrimaryStats);
    }
    
    public int getStat(String primary) {
            return primaryStats.get(primary);
        }
}
