package uml.creational.abstractFactory.products.chicken;

public class KFCChicken implements IChicken{
    @Override
    public void consumeChicken() {
        System.out.println("KFC Chicken\n");
    }
}
