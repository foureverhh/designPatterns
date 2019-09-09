package patterns.factory.abstractFactory.componentUtil;

import patterns.factory.abstractFactory.interfaceComponentUtil.Tyre;

public class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("Luxury tyre revolve stable");
    }
}
