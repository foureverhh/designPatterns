package patterns.factory.abstractFactory.componentUtil;

import patterns.factory.abstractFactory.interfaceComponentUtil.Seat;

public class LuxurySeat implements Seat {

    @Override
    public void massage() {
        System.out.println("Luxury seat can massage");
    }
}
