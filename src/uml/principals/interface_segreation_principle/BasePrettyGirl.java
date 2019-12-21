package uml.principals.interface_segreation_principle;

import uml.principals.interface_segreation_principle.interfaces.IGoodGirl;
import uml.principals.interface_segreation_principle.interfaces.INiceFigure;

public class BasePrettyGirl implements INiceFigure, IGoodGirl {
    @Override
    public void goodLooking() {
        System.out.println(this.getClass().getSimpleName() + " is good looking.");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.getClass().getSimpleName() + " has nice figure.");
    }

    @Override
    public void graceTemperament() {
        System.out.println(this.getClass().getSimpleName() + " has grace temperament.");
    }
}
