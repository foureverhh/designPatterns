package uml.behaviorial.strategyPattern;

import uml.behaviorial.strategyPattern.concreteAlgorithmClasses.AirplaneTravel;
import uml.behaviorial.strategyPattern.concreteAlgorithmClasses.BikeTravel;
import uml.behaviorial.strategyPattern.contextClass.Traveler;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is strategy client.");
        Traveler xiaoLi = new Traveler(new BikeTravel());
        Traveler laoZhang = new Traveler(new AirplaneTravel());
        xiaoLi.takeHoliday();
        laoZhang.takeHoliday();
    }
}
