package runner;

import bag.BagFactory;
import bag.IBag;
import bag.IBagFactory;
import give.GiveSurpriseFactory;
import give.IGiveSurprise;
import surprise.GatherSurprises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {

    static void scenario01(Scanner sc) {

        String bagType;
        int waitTime;
        boolean c;
        do {
            System.out.println("Let's create Bag #1");
            System.out.print("What type of bag do you want (Random, Lifo, Fifo)?\t");
            bagType = sc.nextLine().toUpperCase();
            System.out.print("How long do you want to wait between each gift given (in s)?\t");
            waitTime = sc.nextInt();
            sc.nextLine();
            c = Arrays.stream(IBag.bagTypes).collect(Collectors.toList()).contains(bagType);
        } while (!c);

        // Create a GiveSurpriseFactory based on user Input.
        GiveSurpriseFactory myGiveSurpriseFactory = new GiveSurpriseFactory(bagType, waitTime);
        // Create an object of type IGiveSurprise
        IGiveSurprise myGiveSurprise = myGiveSurpriseFactory.giveSurpriseGenerator();

        // Gather n surprises...
        System.out.print("How many surprises do you want to gather?\t");
        myGiveSurprise.gatherAndPut(sc.nextInt());
        sc.nextLine();

        // Print container:
        myGiveSurprise.getContainer().printSurpriseList();


        // Create Bag #2:
        IBagFactory myBagFactory = new BagFactory();
        IBag myBag;
        boolean d;
        do {
            System.out.println("Let's Create Bag #2");
            System.out.print("What type of bag do you want (Random, Lifo, Fifo)?\t");
            bagType = sc.nextLine().toUpperCase();
            d = Arrays.stream(IBag.bagTypes).collect(Collectors.toList()).contains(bagType);
        } while (!d);
        myBag = myBagFactory.makeBag(bagType);


        System.out.println("Let's add 3 random surprises to this bag...");
        myBag.put(GatherSurprises.gather(3));
        myBag.printSurpriseList();


        // Add One or All surprises to the first bag?
        String oneOrAll;
        do {
            System.out.println("Add ONE or ALL objects to bag #1 using objects from bag #2?");
            oneOrAll = sc.nextLine().toUpperCase();
        } while (!oneOrAll.equals("ONE") && !oneOrAll.equals("ALL"));

        if (oneOrAll.equals("ONE")) {
            myGiveSurprise.put(myBag.takeOut());
        } else if (oneOrAll.equals("ALL")) {
            myGiveSurprise.put(myBag);
        }

        //Print status:
        System.out.println("myGiveSurprise Bag#1 status: ");
        myGiveSurprise.getContainer().printSurpriseList();

        System.out.println("Bag#2 status:");
        myBag.printSurpriseList();


        //Give 1 surprise or give AllSurprises?
        System.out.println("Let's go back to te original myGiveSurprise object: ");
        while (!myGiveSurprise.getContainer().isEmpty()) {
            System.out.print("Do you want to give one surprise or all surprises (type ONE or ALL)? \t");
            String userInput = sc.nextLine().toUpperCase();
            if (userInput.equals("ONE")) {
                myGiveSurprise.giveOne();
            } else if (userInput.equals("ALL")) {
                myGiveSurprise.giveAll();
            } else {
                System.err.println("Input Error");
            }
        }

        // Print Bag#1
        System.out.println("BAG #1: ");
        myGiveSurprise.getContainer().printSurpriseList();
    }

}


