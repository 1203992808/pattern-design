package factory.simple;

import factory.Car;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        Car car = SimpleFactory.getCar("Bwm") ;
        System.out.println(car.getCarName());
        car = SimpleFactory.getCar("benz");
        System.out.println(car.getCarName());
        car = SimpleFactory.getCar("audi");
        System.out.println(car.getCarName());
    }
}
