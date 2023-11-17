import Factory.Factory;
import data.Shape;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Shape rectangle = factory.getProduct("rectangle"); // this will give a rectangle. No direct object creation happens
        rectangle.draw();

        /* benefit is when in future if we need to change the object which return. Just go to the factory method and need to change the implementation
        of the factory method. */
    }
}
