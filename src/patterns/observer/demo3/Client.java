package patterns.observer.demo3;

//https://youtu.be/REOUgHfjR2w
public class Client {
    public static void main(String[] args) {
        System.out.println("This is observer main.");
        LaoWang laoWang = new LaoWang();
        XiaoLi xiaoLi = new XiaoLi();
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.registerObserver(laoWang);
        weatherStation.registerObserver(xiaoLi);

        weatherStation.setHumidity(100);
        weatherStation.setTemperature(36);
        weatherStation.notifyObserver();

        System.out.println(laoWang.getHumidity() + " " + laoWang.getTemperature());
        System.out.println(xiaoLi.getHumidity() + " " +  xiaoLi.getTemperature());
    }
}
