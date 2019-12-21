package uml.creational.abstractFactory.factories;

import uml.creational.abstractFactory.products.chicken.IChicken;
import uml.creational.abstractFactory.products.chicken.McDonaldChicken;
import uml.creational.abstractFactory.products.chips.IChips;
import uml.creational.abstractFactory.products.chips.McDonaldChips;

public class McDonald implements IStore {

    @Override
    public IChips produceChips() {
        System.out.println(this.getClass().getSimpleName() + " produces:");
        return new McDonaldChips();
    }

    @Override
    public IChicken produceChicken() {
        System.out.println(this.getClass().getSimpleName() + " produces:");
        return new McDonaldChicken();
    }
}
