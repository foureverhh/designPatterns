package uml.creational.abstractFactory;

import uml.creational.abstractFactory.factories.McDonald;
import uml.creational.abstractFactory.factories.Dicos;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is factory method");
     /*   IStore mcDonald = new McDonald();
        IChips chips = mcDonald.produceChips();
        chips.eat();*/
        new Dicos().produceChips().consumeChips();
        new McDonald().produceChicken().consumeChicken();
    }
}
