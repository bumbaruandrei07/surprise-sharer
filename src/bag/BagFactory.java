package bag;

import java.util.Arrays;
import java.util.stream.Collectors;


public class BagFactory implements IBagFactory {

    @Override
    public IBag makeBag(String type) {
        type = type.toUpperCase();
        //finding the index of String in allowed types of bags
        int index = Arrays.stream(IBag.bagTypes).collect(Collectors.toList()).indexOf(type);
        switch (index) {
            case 0:
                return new RandomBag();
            case 1:
                return new FifoBag();
            case 2:
                return new LifoBag();
            default:
                System.out.println("This type of bag doesn't exist");
                return null;
        }
    }
}
