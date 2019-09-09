package patterns.factory.abstractFactory;

import patterns.factory.abstractFactory.factoryUtil.LuxuryCarFactory;
import patterns.factory.abstractFactory.interfaceComponentUtil.Engine;
import patterns.factory.abstractFactory.interfaceFactoryUtil.CarFactory;

public class Client {
    public static void main(String[] args) {
        CarFactory luxuryCarFactory = new LuxuryCarFactory();
        Engine luxuryEngine = luxuryCarFactory.createEngine();
        luxuryEngine.run();
    }
}
