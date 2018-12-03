package factory.func;

import factory.BWM;
import factory.Car;

public class BWMFactory implements Factory {
    @Override
    public Car getCar() {
        return new BWM();
    }
}
