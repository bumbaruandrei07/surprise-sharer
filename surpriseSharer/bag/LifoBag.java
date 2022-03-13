package bag;

import surprise.ISurprise;

public class LifoBag extends AbstractBag {
    @Override
    public ISurprise takeOut() {
        if (getSurpriseList().isEmpty()) {
            return null;
        }
        //copy last surprise:
        ISurprise lastSurprise = getSurpriseList().get(getSurpriseList().size() - 1);
        //remove last surprise from surpriseList:
        super.removeInSurpriseList(getSurpriseList().size() - 1);
        // return the last surprise:
        return lastSurprise;
    }
}
