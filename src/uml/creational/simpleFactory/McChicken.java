package uml.creational.simpleFactory;

public class McChicken implements IFood {
    @Override
    public void eat() {
        System.out.println("麦香鸡 " + this.getClass().getSimpleName());
    }
}
