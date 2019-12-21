package uml.creational.abstractFactory.factories;

import uml.creational.abstractFactory.products.chicken.DicosChicken;
import uml.creational.abstractFactory.products.chicken.IChicken;
import uml.creational.abstractFactory.products.chips.DicosChips;
import uml.creational.abstractFactory.products.chips.IChips;

public class Dicos implements IStore {
    @Override
    public IChips produceChips() {
        System.out.println(this.getClass().getSimpleName() + " produces:");
        return new DicosChips();
    }

    @Override
    public IChicken produceChicken() {
        System.out.println(this.getClass().getSimpleName() + " produces:");
        return new DicosChicken();
    }
}
