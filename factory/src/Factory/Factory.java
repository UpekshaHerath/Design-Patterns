package Factory;

import data.Rectangle;
import data.Shape;
import data.Square;

public class Factory {

    // this is the factory method and this will return the object. This is how the factory method will work.
    public Shape getProduct(String shape) {
        if (shape.equals("rectangle")) {
            return new Rectangle();
        }
        if (shape.equals("square")) {
            return new Square();
        }
        return null;
    }
}
