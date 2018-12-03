package factory.abstr;

import factory.BWM;
import factory.Car;
import factory.func.AudiFactory;
import factory.func.BWMFactory;
import factory.func.BenzFactory;

public  abstract class AbstractFactory  {
    protected abstract Car getCar();
    public Car getCar(String name) {
        if (name.equalsIgnoreCase("BWM")){
             return new BWMFactory().getCar();
        } else if (name.equalsIgnoreCase("audi")) {
            return new AudiFactory().getCar();
        } else if (name.equalsIgnoreCase("benz")){
            return new BenzFactory().getCar();
        }
        return null;

    }

    }


