package surpriseSharer.runner;

import surpriseSharer.gather.GatherSurprises;
import surpriseSharer.give.GiveSurpriseAndApplause;
import surpriseSharer.give.GiveSurpriseAndHug;
import surpriseSharer.give.GiveSurpriseAndSing;
import surpriseSharer.surprise.ISurprise;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("\n\t\t\t Testing FIFO \t\n");
        testFifo();

        System.out.println("\n\t\t\t Testing LIFO \t\n");
        testLifo();

        System.out.println("\n\t\t\t Testing RANDOM \t\n");
        testRandom();
    }

    public static void testFifo() {
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

        System.out.println("Giving all...");
        g.giveAll();
    }

    public static void testLifo() {
        ISurprise s1 = GatherSurprises.gather();
        ISurprise s2 = GatherSurprises.gather();
        ISurprise s3 = GatherSurprises.gather();
        ISurprise s4 = GatherSurprises.gather();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        GiveSurpriseAndHug g = new GiveSurpriseAndHug("LIFO", 1);
        g.put(s1);
        g.put(s2);
        g.put(s3);
        g.put(s4);

        System.out.println("Giving one...");
        g.giveOne();
    }

    public static void testRandom() {
        ISurprise s1 = GatherSurprises.gather();
        ISurprise s2 = GatherSurprises.gather();
        ISurprise s3 = GatherSurprises.gather();
        ISurprise s4 = GatherSurprises.gather();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        GiveSurpriseAndSing g = new GiveSurpriseAndSing("RANDOM", 1);
        g.put(s1);
        g.put(s2);
        g.put(s3);
        g.put(s4);

        System.out.println("Giving all...");
        g.giveAll();
    }
}

