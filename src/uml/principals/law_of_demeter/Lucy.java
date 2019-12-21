package uml.principals.law_of_demeter;

public class Lucy {
    public void eat(){
   /*     Bread bread = new Bread();
        Vegetable vegetable = new Vegetable();
        Beef beef = new Beef();
        Hamburger hamburger = new Hamburger(beef,vegetable,bread);*/
        Hamburger hamburger = new KFC().sellHamburger();
        System.out.println(this.getClass().getSimpleName() + " eats hamburger: " + hamburger);
    }
}
