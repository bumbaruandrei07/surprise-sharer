package bag;

public interface IBagFactory {
    // Create a new container, according to the specified type
    // returneaa o referinta de tipul 'bag' -> i.e. un obiect ce va implementa metodele din interfata IBag
    IBag makeBag(String type);
}
