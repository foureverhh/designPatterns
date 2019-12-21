package uml.structurial.proxy.staticProxy;

import uml.structurial.proxy.staticProxy.interfaces.IMacSeller;
import uml.structurial.proxy.staticProxy.reseller.HongKongMacSeller;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is client");
        IMacSeller reseller = new HongKongMacSeller();
        reseller.buy();
    }
}
