public class Singleton {

    private final static Singleton instance = new Singleton();

    // to ensure that the object creation can't be done from outside.
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
