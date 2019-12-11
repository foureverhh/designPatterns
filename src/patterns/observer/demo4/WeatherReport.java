package patterns.observer.demo4;

import java.util.ArrayList;
import java.util.List;

public class WeatherReport implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private int humidity;
    private int temperature;

    //private Weather weather = new Weather();
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(Weather weather) {
        for(Observer observer : observers){
            observer.update(weather);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void setHumidity(Weather weather) {
        this.humidity = weather.getHumidity();
        //notifyAllObservers(weather);
    }

    public void setTemperature(Weather weather) {
        this.temperature = weather.getTemperature();
        //notifyAllObservers(weather);
    }

    public int getHumidity() {
        return humidity;
    }

    public int getTemperature() {
        return temperature;
    }
    /*
    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }*/
}
