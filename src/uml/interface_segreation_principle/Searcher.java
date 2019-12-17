package uml.interface_segreation_principle;

import uml.interface_segreation_principle.interfaces.IGoodGirl;

public class Searcher {
    public void searchActress(BasePrettyGirl girl){
        System.out.println("Search an actress!");
        girl.goodLooking();
        girl.niceFigure();
        girl.graceTemperament();
    }
}
