package lecture1.examples.dice;

import java.util.Random;

public class Dice {
    private int top;
    private Random generator;

    public static final int NUM_SIDES = 6;
    private static final int SUM_OF_SIDES = 7;

    public Dice() {
        generator = new Random();
        roll();
    }
    
    public int getTop() {
        return top;
    }
    
    public int getBottom() {
        return SUM_OF_SIDES - top;
    }
    
    public void roll() {
        // add 1 since generator returns a value between 0 and NUM_SIDES (exclusive)
        top = generator.nextInt(NUM_SIDES) + 1;
    }
}
