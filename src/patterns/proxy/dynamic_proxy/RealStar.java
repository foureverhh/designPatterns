package patterns.proxy.dynamic_proxy;

public class RealStar implements Star {
    private final String NAME = "RealStar ";
    @Override
    public void confer() {
        System.out.println(NAME+"confer()");
    }

    @Override
    public void signContract() {
        System.out.println(NAME+"signContract");
    }

    @Override
    public void bookTicket() {
        System.out.println(NAME+"bookTicket");
    }

    @Override
    public void sing() {
        System.out.println(NAME+"sing");
    }

    @Override
    public void collectMoney() {
        System.out.println(NAME+"collectMoney");
    }
}
