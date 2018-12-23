package mediator;

/**
 * @author syz
 * @date 2018-12-23 16:19
 */
public class TV extends  Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        this.getMediator().register(name,this);
    }

    public void sendMessane(int stateChange) {
        this.getMediator().getMessage(stateChange,getName());
    }
    public void startTV(){
        System.out.println("TV is open");
    }
    public void stopTV (){
        System.out.println("TV is close");
    }
}
