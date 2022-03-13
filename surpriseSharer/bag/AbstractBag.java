package bag;

import surprise.ISurprise;

import java.util.ArrayList;

abstract class AbstractBag implements IBag {

    private ArrayList<ISurprise> surpriseList = new ArrayList<>();


    @Override
    public void put(IBag bagOfSurprises) {
        while (!bagOfSurprises.isEmpty()) {
            put(bagOfSurprises.takeOut());
        }
    }

    @Override
    public void put(ISurprise newSurprise) {
        surpriseList.add(newSurprise);
    }


    @Override
    public boolean isEmpty() {
        return surpriseList.isEmpty();
    }

    @Override
    public int size() {
        return surpriseList.size();
    }

    public ArrayList<ISurprise> getSurpriseList() {
        return surpriseList;
    }

    public void removeInSurpriseList(int num) {
        surpriseList.remove(num);
    }

    @Override
    public void printSurpriseList() {
        if (this.surpriseList == null || surpriseList.isEmpty()) {
            System.out.println("This bag is empty");
        } else {
            System.out.println("Surprise in this bag: ");
            for (ISurprise crtSurprise : this.surpriseList) {
                System.out.println(crtSurprise);
            }
        }
    }
}
