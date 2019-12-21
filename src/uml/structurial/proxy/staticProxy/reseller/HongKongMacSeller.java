package uml.structurial.proxy.staticProxy.reseller;

import uml.structurial.proxy.staticProxy.interfaces.IMacSeller;
import uml.structurial.proxy.staticProxy.whaleSeller.USAMacSeller;

public class HongKongMacSeller implements IMacSeller {
    IMacSeller whaleSeller = new USAMacSeller();
    @Override
    public void buy() {
        whaleSeller.buy();
        System.out.println("Buy a MacBook from " + this.getClass().getSimpleName());
    }
}
