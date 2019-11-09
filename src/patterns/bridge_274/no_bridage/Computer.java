package patterns.bridge_274.no_bridage;

public interface Computer {
    void sale();
}

class Desktop implements Computer{

    @Override
    public void sale() {
        System.out.println("Sale desktop");
    }
}

class Laptop implements Computer{

    @Override
    public void sale() {
        System.out.println("Sale laptop");
    }
}

class Pad implements Computer{

    @Override
    public void sale() {
        System.out.println("Sale pad");
    }
}

class LenovoDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("Sale lenovo desktop");
    }
}

class LenovoLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("Sale lenovo laptop");
    }
}

class LenovoPad extends Pad{
    @Override
    public void sale() {
        System.out.println("Sale lenovo pad");
    }
}
class HasseDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("Sale hasse desktop");
    }
}

class HasseLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("Sale hasse laptop");
    }
}

class HassePad extends Pad{
    @Override
    public void sale() {
        System.out.println("Sale hasse pad");
    }
}

class DellDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("Sale dell desktop");
    }
}

class DellLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("Sale dell laptop");
    }
}

class DellPad extends Pad{
    @Override
    public void sale() {
        System.out.println("Sale dell  pad");
    }
}