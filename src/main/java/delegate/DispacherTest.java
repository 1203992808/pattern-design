package delegate;

public class DispacherTest {
    public static void main(String[] args) {
        Dispacher dispacher = new Dispacher(new ExecutorA());
        dispacher.doSomething();
    }
}
