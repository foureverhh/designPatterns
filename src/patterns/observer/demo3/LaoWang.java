package patterns.observer.demo3;

public class LaoWang implements Observer {
    private int humidity;
    private int temperature;

    @Override
    public void update(WeatherSubject ws) {
        humidity = ((WeatherStation) ws).getHumidity();
        if(humidity > 20){
            System.out.println(this.getClass().getName() + "太潮湿了。");
        }
        temperature = ((WeatherStation) ws).getTemperature();
    }

    public int getHumidity() {
        return humidity;
    }

    public int getTemperature() {
        return temperature;
    }

}
