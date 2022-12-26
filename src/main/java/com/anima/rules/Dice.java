package com.anima.rules;

import java.util.Random;

public class Dice {
    private static final int D4 = 4;
    private static final int D6 = 6;
    private static final int D8 = 8;
    private static final int D10 = 10;
    private static final int D12 = 12;
    private static final int D20 = 20;
    private static final int D100 = 100;
    
    private static final Random random = new Random();
    
    private Dice() {}
    
    public static int roll(int numOfDice, int numSides) {
        int total = 0;
        for (int count = 0; count < numOfDice; count++) {
            //todo use observer pattern to listen for fumble/critical rolls
            total += random.nextInt(numSides) + 1;
        }
        return total;
    }
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
