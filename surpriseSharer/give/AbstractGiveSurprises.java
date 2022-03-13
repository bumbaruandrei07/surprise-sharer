package give;

import bag.BagFactory;
import bag.IBag;
import bag.IBagFactory;
import gather.GatherSurprises;
import surprise.ISurprise;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises implements IGiveSurprise {

    private IBag container;
    private int waitTime; //wait time in seconds
    private final IBagFactory bagFactory;

    AbstractGiveSurprises(String containerType, int waitTime) {
        bagFactory = new BagFactory();
        this.container = bagFactory.makeBag(containerType);

        if (waitTime < 0) {
            waitTime = 0;
        }
        this.waitTime = waitTime;
    }

    @Override
    public void put(ISurprise newSurprise) {
        container.put(newSurprise);
    }

    @Override
    public void put(IBag surprises) {
        //moves all the surprise from a container to this container
        container.put(surprises);
    }

    public void give() {
        container.takeOut().enjoy();
        System.out.println("=================");
        try {
            TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void giveOne() {
        System.out.println("===========");
        give();
        giveWithPassion();

    }

    @Override
    public void giveAll() {
        System.out.println("===========");
        while (!container.isEmpty()) {
            this.give();
        }
        giveWithPassion();
        System.out.println("============");
    }

    @Override
    public IBag getContainer() {
        return container;
    }

    protected abstract void giveWithPassion();


}
