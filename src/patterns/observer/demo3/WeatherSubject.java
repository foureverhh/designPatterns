package patterns.observer.demo3;

public interface WeatherSubject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
