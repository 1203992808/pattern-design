package delegate;

public class Executor implements IExecutor {
    @Override
    public void doSomething() {
        System.out.println("我是职工B,现在在干这件事");
    }
}
