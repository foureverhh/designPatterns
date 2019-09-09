package patterns.factory.abstractFactory.componentUtil;

import patterns.factory.abstractFactory.interfaceComponentUtil.Engine;

public class LowEndEngine implements Engine {

    @Override
    public void run() {
        System.out.println("Low end engine runs slow!");
    }

    @Override
    public void start() {
        System.out.println("Low end engine starts slow!");
    }
}
