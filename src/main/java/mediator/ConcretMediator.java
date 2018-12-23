package mediator;

import factory.abstr.AbstractFactory;

import java.util.HashMap;

/**
 * @author syz
 * @date 2018-12-23 16:05
 */
public  class ConcretMediator implements  Mediator{
    private HashMap<String,Colleague> colleagueHashMap;
    private HashMap<String,String> interMap;
    public ConcretMediator() {
        colleagueHashMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }

    public void register(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName,colleague);
        if (colleague instanceof Alarm) {
            interMap.put("alarm",colleagueName);
        } else if (colleague instanceof  Curtains) {
            interMap.put("curtains",colleagueName);
        } else if (colleague instanceof  TV) {
            interMap.put("tv",colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("coffeeMachine",colleagueName);
        }

    }

    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueHashMap.get(colleagueName) instanceof  Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine)colleagueHashMap.get(interMap.get("coffeeMachine"))).startCoffee();
                ((TV)colleagueHashMap.get(interMap.get("tv"))).startTV();
            } else if (stateChange == 1) {
                ((TV)colleagueHashMap.get(interMap.get("tv"))).stopTV();
            }
        } else if (colleagueHashMap.get(colleagueName) instanceof  Curtains) {
            ((Curtains)colleagueHashMap.get(interMap.get("curtains"))).upContains();

        }

    }

    public void sendMessage() {

    }
}
