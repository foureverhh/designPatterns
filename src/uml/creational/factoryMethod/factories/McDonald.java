package uml.creational.factoryMethod.factories;

import uml.creational.factoryMethod.products.IChips;
import uml.creational.factoryMethod.products.McDonaldChips;

public class McDonald implements IStore{
    @Override
    public IChips produceChips() {
        System.out.println(this.getClass().getSimpleName() + " produces:");
        return new McDonaldChips();
    }
}
