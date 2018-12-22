package observer.obser_self.observer;

/**
 * @author syz
 * @date 2018-12-22 15:36
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
