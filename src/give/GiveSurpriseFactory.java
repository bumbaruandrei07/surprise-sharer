package give;

import helpers.RandomHelper;

import java.util.Locale;

public final class GiveSurpriseFactory {
    private static final int TOTAL_NUMBER_OF_WITH_PASSION = 3;
    int waitTime;
    String cointaierType;

    public GiveSurpriseFactory(String cointaierType, int waitTime) {
        if (waitTime < 0) {
            waitTime = 0;
        }
        this.cointaierType = cointaierType.toUpperCase(Locale.ROOT);
        this.waitTime = waitTime;
    }

    public IGiveSurprise giveSurpriseGenerator() {
        int random = RandomHelper.getRandomInt(TOTAL_NUMBER_OF_WITH_PASSION);
        switch (random) {
            case 0:
                return new GiveSurpriseAndApplause(this.cointaierType, this.waitTime);
            case 1:
                return new GiveSurpriseAndHug(this.cointaierType, this.waitTime);
            case 2:
                return new GiveSurpriseAndSing(this.cointaierType, this.waitTime);
            default:
                System.out.println("Unkwown type of surprise");
        }
        return null;
    }
}
