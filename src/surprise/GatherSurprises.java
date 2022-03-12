package surprise;

import helpers.RandomHelper;

import java.util.ArrayList;

public final class GatherSurprises {

    private final static int numberOfSurprises = 3;
    //o metoda statica, gather(int n), ce primeste un numar intreg n si returneaza un array continand n surprize.
    //o metoda statica, gather(), care va returna o singura surpriza.

    // We prevent instantiation of the class:

    private GatherSurprises() {

    }

    private static ISurprise gather() {
        int randomNum = RandomHelper.getRandomInt(numberOfSurprises);
        switch (randomNum) {
            case 0:
                return FortuneCookie.generate();
            case 1:
                return Candies.generate();
            case 2:
                return MinionToy.generate();
            default:
                System.out.println("Unknown error");
                return null;
        }
    }

    public static ArrayList<ISurprise> gather(int n) {
        ArrayList<ISurprise> surpriseArrayList = new ArrayList<>();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                surpriseArrayList.add(gather());
            }
        }
        return surpriseArrayList;
    }
}
