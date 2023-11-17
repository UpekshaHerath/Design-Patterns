package factorymethod;

import data.ConcreteProductA;
import data.Product;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
