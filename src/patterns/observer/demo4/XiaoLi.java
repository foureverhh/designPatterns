package patterns.observer.demo4;

public class XiaoLi implements Observer{
    @Override
    //public void update(Weather weather) {
    public void update(WeatherReport weather) {
        if(weather.getHumidity() > 20){

            System.out.println("Humidity is: " + weather.getHumidity() + "\n" +
                    "Temperature is: " + weather.getTemperature() + "\n" +
                    this.getClass().getSimpleName() + "says too wet");
        }
    }
}
