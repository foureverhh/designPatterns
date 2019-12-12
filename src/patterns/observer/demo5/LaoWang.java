package patterns.observer.demo5;

import java.util.Observable;
import java.util.Observer;

public class LaoWang implements Observer {
    //Pull style of Observer pattern
    @Override
    public void update(Observable o, Object arg) {
        WeatherStation weatherStation = (WeatherStation)o;
        if(weatherStation.getTemperature() < 0){
            System.out.println(this.getClass().getSimpleName() + " says too cold,羽绒服！！， temperature is " + weatherStation.getTemperature());
        }
        if(weatherStation.getTemperature() > 30)
            System.out.println(this.getClass().getSimpleName() + " says too cold,吃冰棍！！， temperature is " + weatherStation.getTemperature());

        if(weatherStation.isWindy()){
            System.out.println(this.getClass().getSimpleName() + " hates wind");
        }
    }
}
