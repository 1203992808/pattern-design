package mediator;

/**
 * @author syz
 * @date 2018-12-23 16:57
 */
public class Test {
    public static void main(String[] args) {
        Mediator concretMediator = new ConcretMediator();
        TV tv = new TV(concretMediator,"mtv");
        Curtains curtains = new Curtains(concretMediator,"mcurtains");
        CoffeeMachine coffeeMachine = new CoffeeMachine(concretMediator,"mcoffeeMachine");
        Alarm alarm = new Alarm(concretMediator,"malarm");
        alarm.sendMessane(0);
        coffeeMachine.stopCoffee();
        alarm.sendMessane(1);
    }
}
