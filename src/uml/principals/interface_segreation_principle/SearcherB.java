package uml.principals.interface_segreation_principle;

import uml.principals.interface_segreation_principle.interfaces.INiceFigure;

public class SearcherB {
    public void searchSuperModel(INiceFigure niceGirl){
        System.out.println("Search super model!");
        niceGirl.niceFigure();
    }
}
