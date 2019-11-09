package patterns.bridge_274.brideg_demo;

public interface Brand {
    void sale();
}
class Lenovo implements Brand{

    @Override
    public void sale() {
        System.out.println("Levono products");
    }
}

class Dell implements Brand{
    @Override
    public void sale() {
        System.out.println("Dell products");
    }
}

class Hasse implements Brand{
    @Override
    public void sale() {
        System.out.println("Hasse products");
    }
}
