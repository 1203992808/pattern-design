package mediator;

import java.util.Collections;

/**
 * @author syz
 * @date 2018-12-23 16:18
 */
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    public void sendMessane(int stateChange) {
        this.getMediator().getMessage(stateChange,getName());

    }
    public void sendAlarm(int stateChange) {
        sendMessane(stateChange);
    }
}
