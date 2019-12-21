package uml.behaviorial.strategyPattern.contextClass;

import uml.behaviorial.strategyPattern.strategyInterfaces.Travel;

public class Traveler {
    private Travel travel;

    public Traveler(Travel travel) {
        this.travel = travel;
    }

    public void takeHoliday(){
        System.out.println("Traveler travels ");
        travel.travel();
    }
}
