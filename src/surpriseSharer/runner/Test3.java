package surpriseSharer.runner;

import surpriseSharer.surprise.Candies;
import surpriseSharer.surprise.FortuneCookie;
import surpriseSharer.surprise.MinionToy;

public class Test3 {
    public static void main(String[] args) {
        //create a new fortune cookie using the static method generate()
        System.out.println(FortuneCookie.generate());

        //create a new candie using the static method generate()
        Candies candiesI = Candies.generate();
        System.out.println(candiesI);
        candiesI.enjoy();

        //create a new minion toy using the static method generate()
        MinionToy minionToy = MinionToy.generate();
        minionToy.enjoy();
        System.out.println("First minion from array: " + MinionToy.generate());
        System.out.println("Second minion from array: " + MinionToy.generate());
        System.out.println("Third minion from array: " + MinionToy.generate());
        System.out.println("Fourth minion from array: " + MinionToy.generate());
        System.out.println("Fifth minion from array: " + MinionToy.generate());
        System.out.println("Sixth minion from array: " + MinionToy.generate());
        //reset index
        System.out.println("Return to the first minion: " + MinionToy.generate());


    }
}
