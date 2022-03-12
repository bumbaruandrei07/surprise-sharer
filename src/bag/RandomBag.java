package bag;

import helpers.RandomHelper;
import surprise.ISurprise;

public class RandomBag extends AbstractBag {
    @Override
    public ISurprise takeOut() {
        if (getSurpriseList().isEmpty()) {
            return null;
        }

        int randomNumber = RandomHelper.getRandomInt(getSurpriseList().size());
        //copy the surprise
        ISurprise surprise = getSurpriseList().get(randomNumber);
        //delete the surprise from list
        super.removeInSurpriseList(randomNumber);
        return surprise;
    }
}
