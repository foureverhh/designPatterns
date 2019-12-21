package uml.structurial.proxy.whaleSeller;

import uml.structurial.proxy.interfaces.IMacSeller;
import uml.structurial.proxy.reseller.HongKongMacSeller;

public class USAMacSeller implements IMacSeller {
    @Override
    public void buy() {
        System.out.println("Buy a MacBook from " + this.getClass().getSimpleName());
    }
}
