package delegate;

public class Dispacher implements IExecutor {
    private IExecutor executor;
    public Dispacher(){

    }
    public Dispacher(IExecutor executor) {
        this.executor = executor;
    }
    @Override
    public void doSomething() {
        executor.doSomething();
    }
}
