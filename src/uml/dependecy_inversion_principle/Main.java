package uml.dependecy_inversion_principle;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is dependency reversion principle sample");
        new Mother().read(new Newspaper());
    }
}
