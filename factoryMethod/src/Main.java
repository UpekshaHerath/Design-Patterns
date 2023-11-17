import data.Product;
import factorymethod.ConcreteCreatorA;
import factorymethod.ConcreteCreatorB;
import factorymethod.Creator;

public class Main {
    public static void main(String[] args) {
        /***
         * If you need to change the implementation, go to the relevant creator class and change the returning object. That's it.
         * Otherwise, you have to change all the objects from place to place by finding them.
         * No need to change the main method code(client side code not only the main method). That's the beauty.
         */
        Creator creator = new ConcreteCreatorA(); // create a creator object which can use to create product_A
        Product product = creator.factoryMethod();
        product.checkProduct();

        Creator creator1 = new ConcreteCreatorB();
        Product product1 = creator1.factoryMethod();
        product1.checkProduct();
    }
}
