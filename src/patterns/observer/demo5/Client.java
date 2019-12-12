package patterns.observer.demo5;

public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        LaoWang laoWang = new LaoWang();
        XiaoLi xiaoLi = new XiaoLi();

        weatherStation.addObserver(laoWang);
        weatherStation.addObserver(xiaoLi);
        weatherStation.setTemperature(31);
        weatherStation.setWindy(true);
        //weatherStation.notifyObservers();
    }
}
