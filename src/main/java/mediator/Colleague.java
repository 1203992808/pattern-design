package mediator;

/**
 * @author syz
 * @date 2018-12-23 16:07
 */
public abstract class Colleague {
    private Mediator mediator;
    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }
    public abstract  void sendMessane(int stateChange);
}
