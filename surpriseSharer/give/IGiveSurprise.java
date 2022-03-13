package give;

import bag.IBag;
import surprise.ISurprise;

public interface IGiveSurprise {

    void giveOne();
    void giveAll();
    void gatherAndPut(int number);
    IBag getContainer();
    void put(ISurprise newSurprise);
    void put(IBag newBag);
}
