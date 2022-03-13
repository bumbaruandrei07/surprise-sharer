package runner;

import bag.BagFactory;
import bag.IBag;
import bag.IBagFactory;
import give.GiveSurpriseAndApplause;
import give.GiveSurpriseFactory;
import give.IGiveSurprise;
import gather.GatherSurprises;
import surprise.ISurprise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        System.out.println("\n\t testGiveSurprisesAndApplauseFIFO \t\n");
        testGiveSurprisesAndApplauseFIFO();

        System.out.println("\n\t testGiveSurprisesAndApplauseLIFO \t\n");
        testGiveSurprisesAndApplauseLIFO();

        System.out.println("\n\t testGiveSurprisesAndApplauseRANDOM \t\n");
        testGiveSurprisesAndApplauseRANDOM();

    }

    public static void testGiveSurprisesAndApplauseFIFO() {
        ISurprise s1 = GatherSurprises.gather();
        ISurprise s2 = GatherSurprises.gather();
        ISurprise s3 = GatherSurprises.gather();
        ISurprise s4 = GatherSurprises.gather();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


        GiveSurpriseAndApplause g = new GiveSurpriseAndApplause("FIFO", 1);

        g.put(s1);
        g.put(s2);
        g.put(s3);
        g.put(s4);

        System.out.println("\n Giving \n");

        g.giveAll();
    }

    public static void testGiveSurprisesAndApplauseLIFO() {
        ISurprise s1 = GatherSurprises.gather();
        ISurprise s2 = GatherSurprises.gather();
        ISurprise s3 = GatherSurprises.gather();
        ISurprise s4 = GatherSurprises.gather();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        GiveSurpriseAndApplause g = new GiveSurpriseAndApplause("LIFO", 1);
        g.put(s1);
        g.put(s2);
        g.put(s3);
        g.put(s4);

        System.out.println("\n Giving \n");

        g.giveAll();
    }

    public static void testGiveSurprisesAndApplauseRANDOM() {
        ISurprise s1 = GatherSurprises.gather();
        ISurprise s2 = GatherSurprises.gather();
        ISurprise s3 = GatherSurprises.gather();
        ISurprise s4 = GatherSurprises.gather();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        GiveSurpriseAndApplause g = new GiveSurpriseAndApplause("RANDOM", 1);
        g.put(s1);
        g.put(s2);
        g.put(s3);
        g.put(s4);

        System.out.println("\n Giving\n");

        g.giveAll();
    }
}


