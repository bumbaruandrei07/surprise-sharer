package bag;

import surprise.ISurprise;

public class FifoBag extends AbstractBag {
    @Override
    public ISurprise takeOut() {
        if (getSurpriseList().isEmpty()) {
            return null;
        }

        // copy last surprise in
        ISurprise firstSurprise = getSurpriseList().get(0);
        //remove last surprise from list
        super.removeInSurpriseList(0);
        // return the surprise:
        return firstSurprise;
    }
}
