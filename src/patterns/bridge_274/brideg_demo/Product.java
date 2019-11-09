package patterns.bridge_274.brideg_demo;

public class Product {
    public static void main(String[] args) {

    Electronics lenovoLaptop =new Laptop(new Lenovo());
    lenovoLaptop.sale();
    }

}
