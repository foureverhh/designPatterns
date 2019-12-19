package uml.creational.factoryMethod.factories;

import uml.creational.factoryMethod.products.IChips;

public interface IStore {
    IChips produceChips();
}
