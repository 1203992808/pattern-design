package factory.func;

public class FactoryTest {
    public static void main(String[] args) {
        Factory bwm = new BWMFactory();
        System.out.println(bwm.getCar().getCarName());
        Factory benz = new BenzFactory();
        System.out.println(benz.getCar().getCarName());
        Factory audi = new AudiFactory();
        System.out.println(audi.getCar().getCarName());
    }
}
