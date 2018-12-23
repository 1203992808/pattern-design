package mediator;

/**
 * @author syz
 * @date 2018-12-23 16:04
 */
public interface Mediator {
      void register (String colleagueName,Colleague colleague);
      void getMessage(int stateChange,String colleagueName);
      void sendMessage();

}
