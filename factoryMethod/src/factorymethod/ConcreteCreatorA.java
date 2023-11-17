package factorymethod;

import data.ConcreteProductA;
import data.Product;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA(); // if we need to change just change this return. No need to go and change the client code.
    }
}
