package factorymethod;

import data.ConcreteProductB;
import data.Product;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
