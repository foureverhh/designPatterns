package patterns.observer.demo4;

public class Client {
    public static void main(String[] args) {
        Weather weather = new Weather();

        LaoWang laoWang = new LaoWang();
        XiaoLi xiaoLi = new XiaoLi();

        WeatherReport weatherReport = new WeatherReport();
        weatherReport.register(laoWang);
        weatherReport.register(xiaoLi);

        weather.setHumidity(30);
        weather.setTemperature(19);
        weatherReport.setHumidity(weather);
        weatherReport.setTemperature(weather);
        weatherReport.notifyAllObservers(weather);

       /* weather.setHumidity(50);
        weather.setTemperature(19);
        weatherReport.setHumidity(weather);
        weatherReport.setTemperature(weather);
*/
    }
}
