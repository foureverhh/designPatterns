package patterns.factory.abstractFactory.componentUtil;

import patterns.factory.abstractFactory.interfaceComponentUtil.Seat;

public class LowEndSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("Low end seat can not massage");
    }
}
