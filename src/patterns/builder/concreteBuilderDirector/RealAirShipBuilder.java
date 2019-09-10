package patterns.builder.concreteBuilderDirector;

import patterns.builder.airshipBuilder.AirShipBuilder;
import patterns.builder.componentUtil.Engine;
import patterns.builder.componentUtil.EscapeTower;
import patterns.builder.componentUtil.OrbitalModule;

public class RealAirShipBuilder implements AirShipBuilder {
    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("Build OrbitalModule.");
        return new OrbitalModule("Tiger Orbital Module");
    }

    @Override
    public Engine builderEngine() {
        System.out.println("Build Engine");
        return new Engine("Tiger Engine");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("Build EscapeTower");
        return new EscapeTower("Tiger EscapeTower");
    }
}
