package bag;

import java.util.Arrays;
import java.util.stream.Collectors;


public class BagFactory implements IBagFactory {

    @Override
    public IBag makeBag(String type) {
        type = type.toUpperCase();

        switch (type) {
            case "RANDOM":
                return new RandomBag();
            case "FIFO":
                return new FifoBag();
            case "LIFO":
                return new LifoBag();
            default:
                System.out.println("This type of bag doesn't exist");
                return null;
        }
    }
}
