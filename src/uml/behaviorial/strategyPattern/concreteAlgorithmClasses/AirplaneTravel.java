package uml.behaviorial.strategyPattern.concreteAlgorithmClasses;

import uml.behaviorial.strategyPattern.strategyInterfaces.Travel;

public class AirplaneTravel implements Travel {
    @Override
    public void travel() {
        System.out.println("Travel by Airplane. price 1000");
    }
}
