package uml.creational.abstractFactory.products.chips;

public class McDonaldChips implements IChips {
    @Override
    public void consumeChips() {
        System.out.println("McDonald chips\n");
    }
}
