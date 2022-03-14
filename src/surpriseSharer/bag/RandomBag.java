package surpriseSharer.bag;

import surpriseSharer.helpers.RandomHelper;
import surpriseSharer.surprise.ISurprise;


//implementation of a random bag using the abstract class.
public class RandomBag extends AbstractBag {

    @Override
    public ISurprise takeOut() {
        if (getSurpriseList().isEmpty()){
            return null;
        }
        int randomNumber = RandomHelper.getNewRandomInt(getSurpriseList().size());
        // Copy the surprise
        ISurprise surprise = getSurpriseList().get(randomNumber);
        // Delete the surprise from list
        super.removeInSurpriseList(randomNumber);
        // Return the surprise
        return surprise;
    }

}
