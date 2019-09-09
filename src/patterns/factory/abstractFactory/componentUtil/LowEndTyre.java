package patterns.factory.abstractFactory.componentUtil;

import patterns.factory.abstractFactory.interfaceComponentUtil.Tyre;

public class LowEndTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("Low end tyre revolve unstable");
    }
}
