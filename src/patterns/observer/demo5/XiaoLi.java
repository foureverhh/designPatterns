package patterns.observer.demo5;

import java.util.Observable;
import java.util.Observer;

public class XiaoLi implements Observer {
    //Push style of Observer pattern
    private  int temperature;
    private  boolean windy;

    @Override
    public void update(Observable o, Object arg) {
     /*   WeatherStation weatherStation = (WeatherStation)o;
        if(weatherStation.getTemperature() < 0){
            System.out.println(this.getClass().getSimpleName() + " says too cold,羽绒服！！， temperature is " + weatherStation.getTemperature());
        }*/
        if(arg instanceof Integer)
            temperature = (Integer) arg;
        if(arg instanceof Boolean)
            windy = (Boolean) arg;
        if(temperature > 30){
            System.out.println(this.getClass().getSimpleName() + " says too hot,开空调！！， temperature is " + temperature);
        }

        if(windy){
            System.out.println(this.getClass().getSimpleName() + " hates wind!");
        }
    }
}
