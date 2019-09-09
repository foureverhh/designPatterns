package patterns.factory.abstractFactory.factoryUtil;

import patterns.factory.abstractFactory.componentUtil.LowEndEngine;
import patterns.factory.abstractFactory.componentUtil.LowEndSeat;
import patterns.factory.abstractFactory.componentUtil.LowEndTyre;
import patterns.factory.abstractFactory.interfaceComponentUtil.Engine;
import patterns.factory.abstractFactory.interfaceComponentUtil.Seat;
import patterns.factory.abstractFactory.interfaceComponentUtil.Tyre;
import patterns.factory.abstractFactory.interfaceFactoryUtil.CarFactory;

public class LowEndCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LowEndEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowEndSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowEndTyre();
    }
}
