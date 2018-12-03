package factory.func;

import factory.Benz;
import factory.Car;

public class BenzFactory implements  Factory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
