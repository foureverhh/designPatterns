package uml.structurial.proxy.reseller;

import uml.structurial.proxy.interfaces.IMacSeller;
import uml.structurial.proxy.whaleSeller.USAMacSeller;

public class HongKongMacSeller implements IMacSeller {
    IMacSeller whaleSeller = new USAMacSeller();
    @Override
    public void buy() {
        whaleSeller.buy();
        System.out.println("Buy a MacBook from " + this.getClass().getSimpleName());
    }
}
