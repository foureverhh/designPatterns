package uml.structurial.proxy;

import uml.structurial.proxy.interfaces.IMacSeller;
import uml.structurial.proxy.reseller.HongKongMacSeller;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is client");
        IMacSeller reseller = new HongKongMacSeller();
        reseller.buy();
    }
}
