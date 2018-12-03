package factory.simple;

import factory.Audi;
import factory.BWM;
import factory.Benz;
import factory.Car;

public class SimpleFactory {
    public static Car getCar(String name) {
        if (name.equalsIgnoreCase("BWM")){
            return new BWM();
        } else if (name.equalsIgnoreCase("Audi")) {
            return new Audi();
        } else if (name.equalsIgnoreCase("Benz")) {
            return new Benz();
        }
        return null;
    }
}
