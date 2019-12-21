package uml.behaviorial.strategyPattern.concreteAlgorithmClasses;

import uml.behaviorial.strategyPattern.strategyInterfaces.Travel;

public class BikeTravel implements Travel {
    @Override
    public void travel() {
        System.out.println("Travel by bike, price 0");
    }
}
