package surpriseSharer.bag;

public class BagFactory implements  IBagFactory{

    public IBag makeBag(String type) {
        type = type.toUpperCase();

        switch (type){
            case "RANDOM": return new RandomBag();
            case "FIFO": return new FifoBag();
            case "LIFO": return new LifoBag();
            default:
                System.err.printf("Error: this type of surprise.bag does not exist \n");
                return null;
        }
    }
}
