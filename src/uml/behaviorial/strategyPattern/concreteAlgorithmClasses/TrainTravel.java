package uml.behaviorial.strategyPattern.concreteAlgorithmClasses;

import uml.behaviorial.strategyPattern.strategyInterfaces.Travel;

public class TrainTravel implements Travel {
    @Override
    public void travel() {
        System.out.println("Travel by train, price 500");
    }
}
