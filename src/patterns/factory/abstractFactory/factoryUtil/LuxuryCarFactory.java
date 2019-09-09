package patterns.factory.abstractFactory.factoryUtil;

import patterns.factory.abstractFactory.componentUtil.LuxuryEngine;
import patterns.factory.abstractFactory.interfaceComponentUtil.Engine;
import patterns.factory.abstractFactory.interfaceComponentUtil.Seat;
import patterns.factory.abstractFactory.interfaceComponentUtil.Tyre;
import patterns.factory.abstractFactory.interfaceFactoryUtil.CarFactory;

public class LuxuryCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return null;
    }

    @Override
    public Tyre createTyre() {
        return null;
    }
}
