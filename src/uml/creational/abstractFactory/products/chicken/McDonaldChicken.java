package uml.creational.abstractFactory.products.chicken;

public class McDonaldChicken implements IChicken {
    @Override
    public void consumeChicken() {
        System.out.println("McDonald Chicken\n");
    }
}
