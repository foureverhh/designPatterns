package uml.law_of_demeter;

public class KFC {
    public Hamburger sellHamburger(){
        Bread bread = new Bread();
        Vegetable vegetable = new Vegetable();
        Beef beef = new Beef();
        return new Hamburger(beef,vegetable,bread);
    }
}
