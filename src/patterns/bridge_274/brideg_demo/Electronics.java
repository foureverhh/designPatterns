package patterns.bridge_274.brideg_demo;

public class Electronics implements Brand{
    protected Brand brand;
    public Electronics(Brand brand){
        this.brand = brand;
    }
    @Override
    public void sale(){
        brand.sale();
    }

}

class Desktop extends Electronics{

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("Category Desktop");
    }
}
class Laptop extends Electronics{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("Category Laptop");
    }
}

class Pad extends Electronics{

    public Pad(Brand brand) {
        super(brand);
        System.out.println("Category Pad");
    }
}