package com.anima.generation;

import java.util.HashMap;
import java.util.Map;

public class StatsMap <K, V> extends HashMap<K, V> {
    
    public StatsMap(Map<? extends K, ? extends V> primaryStats) {
        super(primaryStats);
    }
    @Override
    public V put(K key, V value) {
        throw new UnsupportedOperationException("Cannot add new keys to map");
    }
}
