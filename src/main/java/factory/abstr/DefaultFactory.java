package factory.abstr;

import factory.Car;
import factory.func.AudiFactory;

public class DefaultFactory extends AbstractFactory{
    private AudiFactory audi = new AudiFactory();
    @Override
    protected Car getCar() {
        return audi.getCar();
    }
}
