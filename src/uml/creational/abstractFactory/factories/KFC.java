package uml.creational.abstractFactory.factories;

import uml.creational.abstractFactory.products.chicken.IChicken;
import uml.creational.abstractFactory.products.chicken.KFCChicken;
import uml.creational.abstractFactory.products.chips.IChips;
import uml.creational.abstractFactory.products.chips.KFCChips;

public class KFC implements IStore {
    @Override
    public IChips produceChips() {
        System.out.println(this.getClass().getSimpleName() + " produces:");
        return new KFCChips();
    }

    @Override
    public IChicken produceChicken() {
        System.out.println(this.getClass().getSimpleName() + " produces:");
        return new KFCChicken();
    }
}
