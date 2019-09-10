package patterns.builder;

import patterns.builder.airshipBuilder.AirShipBuilder;
import patterns.builder.airshipDirector.AirShipDirector;
import patterns.builder.concreteBuilderDirector.RealAirShipBuilder;
import patterns.builder.concreteBuilderDirector.RealAirShipDirector;
import patterns.builder.model.AirShip;

public class Client {
    public static void main(String[] args) {
        AirShipBuilder myAirShipBuilder = new RealAirShipBuilder();
        AirShipDirector myDirector = new RealAirShipDirector(myAirShipBuilder);
        AirShip myAirShip = myDirector.createAirship();
        System.out.println(myAirShip);
    }


}
