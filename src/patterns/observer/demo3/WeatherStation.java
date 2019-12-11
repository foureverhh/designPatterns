package patterns.observer.demo3;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherSubject{
    List<Observer> observers = new ArrayList<>();
    private int temperature = 0;
    private int humidity = 0;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observers){
            o.update(this);
        }
    }

    public int getTemperature(){
        return temperature;
    }

    public int getHumidity(){
        return humidity;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
