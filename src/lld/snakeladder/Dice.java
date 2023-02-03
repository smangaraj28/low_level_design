package lld.snakeladder;

import java.util.Random;

public class Dice {
    // rollDice() => random numbers from 1 to 6

    public int rollDice() {
        Random random = new Random();
        return 1 + random.nextInt(6);
    }
}
