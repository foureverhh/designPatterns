package uml.interface_segreation_principle;

import uml.interface_segreation_principle.interfaces.IGoodGirl;
import uml.interface_segreation_principle.interfaces.INiceFigure;

//public class Angelababy implements IGoodGirl, INiceFigure {
public class Angelababy extends BasePrettyGirl {
    @Override
    public void goodLooking() {
        System.out.println(this.getClass().getSimpleName() + "is goodLooking.");
    }

     @Override
    public void niceFigure() {
        System.out.println(this.getClass().getSimpleName() + "has nice figure.");
    }

    @Override
    public void graceTemperament() {
        System.out.println(this.getClass().getSimpleName() + "has grace temperament.");
    }
}
