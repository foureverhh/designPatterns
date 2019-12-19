package uml.creational.simpleFactory;

public class Chips implements IFood {
    @Override
    public void eat() {
        System.out.println("薯条 " + this.getClass().getSimpleName());
    }
}
