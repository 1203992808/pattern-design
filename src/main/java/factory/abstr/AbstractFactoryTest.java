package factory.abstr;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        DefaultFactory factory = new DefaultFactory();
        System.out.println(factory.getCar("audi").getCarName());
        System.out.println(factory.getCar().getCarName());
        System.out.println(factory.getCar("benz").getCarName());
    }
}
