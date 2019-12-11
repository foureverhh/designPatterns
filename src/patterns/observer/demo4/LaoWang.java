package patterns.observer.demo4;

public class LaoWang implements Observer{

    @Override
    public void update(Weather weather) {
        if(weather.getTemperature() < 20){
            System.out.println("Humidity is: " + weather.getHumidity() + "\n" +
                    "Temperature is: " + weather.getTemperature() + "\n" +
                     this.getClass().getSimpleName() + "says too cold");
        }
    }
}
