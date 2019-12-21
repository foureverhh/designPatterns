package uml.creational.abstractFactory.products.chicken;

public class DicosChicken implements IChicken {
    @Override
    public void consumeChicken() {
        System.out.println("Dicos Chicken\n");
    }
}
