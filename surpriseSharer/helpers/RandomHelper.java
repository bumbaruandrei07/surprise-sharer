package helpers;

import java.util.Random;

public final class RandomHelper {

    private static Random randomComponent = new Random();

    //returns a random number between 0 and max
    public static int getRandomInt(int max) {
        int newRandom = randomComponent.nextInt(max);
        return newRandom;
    }
}
