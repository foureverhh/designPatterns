package patterns.observer.demo3;

public class XiaoLi implements Observer {
    private int humidity;
    private int temperature;

    @Override
    public void update(WeatherSubject ws) {
        humidity = ((WeatherStation) ws).getHumidity();
        temperature = ((WeatherStation) ws).getTemperature();
        if(temperature > 35){
            System.out.println(this.getClass().getName() + "热死了，开空调！");
        }
    }

    public int getHumidity() {
        return humidity;
    }

    public int getTemperature() {
        return temperature;
    }
}
