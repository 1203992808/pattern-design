package delegate;

public class ExecutorA implements  IExecutor {
    @Override
    public void doSomething() {
        System.out.println("我是职工A,现在在干这件事");
    }
}
