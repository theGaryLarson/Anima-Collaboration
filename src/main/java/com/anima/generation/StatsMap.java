package com.anima.generation;

import java.util.HashMap;
import java.util.Map;


/**
 * A Map implementation that only allows replacing values for existing keys and throws an exception when attempting to add new keys.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public class StatsMap<K, V> extends HashMap<K, V> {
    
    /**
     * Constructs a new {@code StatsMap} instance with the specified primary stats map.
     *
     * @param primaryStats a map whose keys and values are to be placed in this map
     */
    public StatsMap(Map<? extends K, ? extends V> primaryStats) {
        super(primaryStats);
    }
    
    /**
     * Associates the specified value with the specified key in this map. If the map previously contained a mapping for the key, the old value is replaced.
     *
     * @param key key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with the key, or {@code null} if there was no mapping for the key
     * @throws UnsupportedOperationException if the map does not contain the key and an attempt is made to add a new key
     */
    @Override
    public V put(K key, V value) {
        V val;
        if (containsKey(key)) {
            val = get(key);
            super.put(key, value);
        } else {
            throw new UnsupportedOperationException("Cannot add new keys to map");
        }
        return val;
    }
}
