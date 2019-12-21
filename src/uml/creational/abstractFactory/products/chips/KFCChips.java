package uml.creational.abstractFactory.products.chips;

public class KFCChips implements IChips {
    @Override
    public void consumeChips() {
        System.out.println("KFC chips\n");
    }
}
