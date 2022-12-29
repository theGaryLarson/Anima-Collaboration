package com.anima.generation;

import com.anima.base.Actor;
import com.anima.base.Output;
import com.anima.characters.PrimaryStatsComponent;
import com.anima.rules.Dice;

import java.util.Arrays;

public class ActorFactory {
    int[] rolls;
    Output output;
    
    public ActorFactory(Actor actor, Difficulty difficulty, Output output) {
        rolls = new int[8];
        switch (difficulty) {
            case Novice   -> novicePrimaryStats(actor);
            case Easy     -> easyPrimaryStats(actor);
            case Standard -> standardPrimaryStats(actor);
            case Hardcore -> hardcorePrimaryStats(actor);
        }
        
    }
    /**
     * Method 4 from rule book for generating primary Stats
     */
    
    private void novicePrimaryStats(Actor actor) {

        //todo: uhhhhh
        int roll1;
        int roll2;
        final int TOTAL_ROLLS = 8;
        for (int roll = 1; roll <= TOTAL_ROLLS; roll++) {
            roll1 = Dice.rollD10();
            roll2 = Dice.rollD10();
            rolls[roll] = Math.max(roll1, roll2);
        }
        chooseStats(actor, rolls, output);
    }
    
    /**
     * Method 2 from rule book for generating primary Stats
     *
     */
    public void easyPrimaryStats(Actor actor) {
        //todo: write this up according to method 2
        chooseStats(actor, rolls, output);
    }
    
    /**
     * Method 1 from rule book for generating primary Stats
     *
     */
    public void standardPrimaryStats(Actor actor) {
        final int GARBAGE_DIE_ROLL = 3;
        final int TOTAL_ROLLS = 8;
        for (int die = 1; die <= TOTAL_ROLLS; die++) {
            int roll = Dice.rollD10();
            while (roll <= GARBAGE_DIE_ROLL) {
                roll = Dice.rollD10();
            }
            rolls[die] = roll;
        }
        Arrays.sort(rolls);
        //replace the lowest die with 9 according to the rules
        rolls[0] = Math.max(rolls[0], 9);
        //player assigns each roll to a primary stat
        chooseStats(actor, rolls, output);
    }
    
    /**
     * Method 3 from rule book for generating primary Stats
     *
     */
    public void hardcorePrimaryStats(Actor actor) {
        PrimaryStatsComponent stats = new PrimaryStatsComponent();
        //todo: write this up according to method 3
        actor.setPrimaryStats(stats);
    }
    
    private void chooseStats(Actor actor, int[] rolls, Output c) {
        //todo: implement feature that allows user to choose where to place stats
        // decouple so can easily be swapped from console to window or any other output
        // (adapter pattern for inputs maybe)
        PrimaryStatsComponent stats = new PrimaryStatsComponent();
        
        actor.setPrimaryStats(stats);
    }
    

}
