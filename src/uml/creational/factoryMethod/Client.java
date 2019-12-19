package uml.creational.factoryMethod;

import uml.creational.factoryMethod.factories.Dicos;
import uml.creational.factoryMethod.factories.IStore;
import uml.creational.factoryMethod.factories.McDonald;
import uml.creational.factoryMethod.products.IChips;
import uml.creational.factoryMethod.products.McDonaldChips;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is factory method");
     /*   IStore mcDonald = new McDonald();
        IChips chips = mcDonald.produceChips();
        chips.eat();*/
        new Dicos().produceChips().eat();
    }
}
