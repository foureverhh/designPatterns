package patterns.factory.abstractFactory.interfaceFactoryUtil;

import patterns.factory.abstractFactory.interfaceComponentUtil.Engine;
import patterns.factory.abstractFactory.interfaceComponentUtil.Seat;
import patterns.factory.abstractFactory.interfaceComponentUtil.Tyre;

public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}

