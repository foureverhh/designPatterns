package uml.creational.factoryMethod.factories;

import uml.creational.factoryMethod.products.IChips;
import uml.creational.factoryMethod.products.KFCChips;

public class KFC implements IStore {
    @Override
    public IChips produceChips() {
        System.out.println(this.getClass().getSimpleName() + " produces:");
        return new KFCChips();
    }
}
