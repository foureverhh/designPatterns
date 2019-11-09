package patterns.proxy.static_proxy;

public class ProxyStar implements Star{
    private final String NAME =  "Proxy Star ";
    private RealStar realStar = new RealStar();
    @Override
    public void confer() {
        System.out.println(NAME+"confer");
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
        realStar.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println(NAME+"collectMoney");
    }
}
