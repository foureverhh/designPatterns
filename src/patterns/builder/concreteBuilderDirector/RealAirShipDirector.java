package patterns.builder.concreteBuilderDirector;

import patterns.builder.airshipBuilder.AirShipBuilder;
import patterns.builder.airshipDirector.AirShipDirector;
import patterns.builder.model.AirShip;

public class RealAirShipDirector implements AirShipDirector {
    private AirShipBuilder builder;

    public RealAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip createAirship() {
        AirShip airShip = new AirShip();
        airShip.setEngine(builder.builderEngine());
        airShip.setEscapeTower(builder.builderEscapeTower());
        airShip.setOrbitalModule(builder.builderOrbitalModule());
        return airShip;
    }
}
