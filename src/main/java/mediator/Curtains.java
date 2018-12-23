package mediator;

/**
 * @author syz
 * @date 2018-12-23 16:19
 */
public class Curtains extends  Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        this.getMediator().register(name,this);
    }

    public void sendMessane(int stateChange) {
        this.getMediator().getMessage(stateChange,getName());

    }
    public void upContains () {
        System.out.println("I am holding Up Curtains!");
    }
}
