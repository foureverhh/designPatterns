package patterns.observer.demo5;

import java.util.Observable;

public class WeatherStation extends Observable {
    private int temperature;
    private boolean windy;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        setChanged();
        notifyObservers(temperature);
    }

    public void setWindy(boolean windy) {
        this.windy = windy;
        setChanged();
        notifyObservers(windy);
    }

    public int getTemperature() {
        return temperature;
    }

    public boolean isWindy() {
        return windy;
    }
}
