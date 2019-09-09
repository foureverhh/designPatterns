package patterns.factory.abstractFactory.componentUtil;

import patterns.factory.abstractFactory.interfaceComponentUtil.Engine;

public class LuxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("Engine runs fast!");
    }

    @Override
    public void start() {
        System.out.println("Engine starts quickly!");
    }
}
