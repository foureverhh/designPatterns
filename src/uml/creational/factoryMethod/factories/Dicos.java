package uml.creational.factoryMethod.factories;

import uml.creational.factoryMethod.products.DicosChips;
import uml.creational.factoryMethod.products.IChips;

public class Dicos implements IStore {
    @Override
    public IChips produceChips() {
        System.out.println(this.getClass().getSimpleName() + " produces:");
        return new DicosChips();
    }
}
