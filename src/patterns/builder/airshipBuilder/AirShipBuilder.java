package patterns.builder.airshipBuilder;

import patterns.builder.componentUtil.Engine;
import patterns.builder.componentUtil.EscapeTower;
import patterns.builder.componentUtil.OrbitalModule;

public interface AirShipBuilder {
    OrbitalModule builderOrbitalModule();
    Engine  builderEngine();
    EscapeTower builderEscapeTower();
}
