package patterns.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        //Star real = new RealStar();
        Star proxy = new ProxyStar();

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();
    }
}
