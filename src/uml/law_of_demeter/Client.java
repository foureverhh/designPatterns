package uml.law_of_demeter;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is law of demeter!");
        new Lily().eat();
        new Lucy().eat();
    }
}
