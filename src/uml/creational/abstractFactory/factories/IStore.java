package uml.creational.abstractFactory.factories;

import uml.creational.abstractFactory.products.chicken.IChicken;
import uml.creational.abstractFactory.products.chips.IChips;

public interface IStore {
    IChips produceChips();
    IChicken produceChicken();
}
