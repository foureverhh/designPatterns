package patterns.builder.model;

import patterns.builder.componentUtil.Engine;
import patterns.builder.componentUtil.EscapeTower;
import patterns.builder.componentUtil.OrbitalModule;

public class AirShip {
    private OrbitalModule orbitalModule;
    private Engine engine;
    private EscapeTower escapeTower;

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    @Override
    public String toString() {
        return "A new airship with "+this.engine+", and "+this.escapeTower+", and"+this.orbitalModule;
    }
}
