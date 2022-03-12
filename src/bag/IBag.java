package bag;

import surprise.ISurprise;

import java.util.ArrayList;

public interface IBag {

    public static final String[] bagTypes = {"RANDOM", "FIFO", "LIFO"};

    //adds a surprise in the bag
    void put(ISurprise newSurprise);
    void put(ArrayList<ISurprise> newSurpriseList);


    //adds all the surprises from another IBag
    // -> the 'bagOfSurprises' will be empty() afterwards
    void put(IBag bagOfSurprises);

    // removes a surprise from the bag and returns it
    ISurprise takeOut();

    // Checks if the bag is empty or not
    boolean isEmpty();

    // Returns the number of surprises
    int size();

    //Displays the list of surprises

    void printSurpriseList();
}
