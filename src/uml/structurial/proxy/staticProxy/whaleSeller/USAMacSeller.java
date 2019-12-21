package uml.structurial.proxy.staticProxy.whaleSeller;

import uml.structurial.proxy.staticProxy.interfaces.IMacSeller;

public class USAMacSeller implements IMacSeller {
    @Override
    public void buy() {
        System.out.println("Buy a MacBook from " + this.getClass().getSimpleName());
    }
}
