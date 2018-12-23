package mediator;

/**
 * @author syz
 * @date 2018-12-23 16:19
 */
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    public void sendMessane(int stateChange) {
        this.getMediator().getMessage(stateChange,getName());

    }
    public void startCoffee(){
        System.out.println("It's time to startcoffee!");
    }
    public void stopCoffee () {
        System.out.println(" after 5 minutes");
        System.out.println("coffee is finished");
        sendMessane(1);
    }
}
