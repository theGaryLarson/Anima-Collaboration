package com.anima.rules;

import java.util.Random;

public class Dice {
    public static final int D4 = 4;
    public static final int D6 = 6;
    public static final int D8 = 8;
    public static final int D10 = 10;
    public static final int D12 = 12;
    public static final int D20 = 20;
    public static final int D100 = 100;
    
    private static final Random random = new Random();
    
    private Dice() {}
    
    public static int rollD4() {
        return random.nextInt(D4) + 1;
    }
    
    public static int rollD6() {
        return random.nextInt(D6) + 1;
    }
    
    public static int rollD8() {
        return random.nextInt(D8) + 1;
    }
    
    public static int rollD10() {
        return random.nextInt(D10) + 1;
    }
    
    public static int rollD12() {
        return random.nextInt(D12) + 1;
    }
    
    public static int rollD20() {
        return random.nextInt(D20) + 1;
    }
    
    public static int rollD100() {
        return random.nextInt(D100) + 1;
    }
}
