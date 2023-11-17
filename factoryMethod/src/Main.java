import data.Product;
import factorymethod.ConcreteCreatorA;
import factorymethod.ConcreteCreatorB;
import factorymethod.Creator;

public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreatorA(); // create a creator object which can use to create product_A
        Product product = creator.factoryMethod();
        product.checkProduct();

        Creator creator1 = new ConcreteCreatorB();
        Product product1 = creator1.factoryMethod();
        product1.checkProduct();
    }
}
