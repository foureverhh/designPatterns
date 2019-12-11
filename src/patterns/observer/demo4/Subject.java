package patterns.observer.demo4;

public interface Subject {
    void register(Observer observer);
    void remove(Observer observer);
    //void notifyAllObservers(Weather weather);
    //For weatherReport
    void notifyAllObservers();
}
