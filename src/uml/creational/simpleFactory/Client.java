package uml.creational.simpleFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is simple factory demo");
        McDonald mcDonald = new McDonald();
        IFood food  = mcDonald.getFood("chip");
        food.eat();
        food = mcDonald.getFood("chicken");
        food.eat();
    }
}
