package uml.structurial.proxy.dynamicProxy.concreteClasses;

import uml.structurial.proxy.dynamicProxy.interfaces.IMiSeller;

public class MiStore implements IMiSeller {
    @Override
    public void buy() {
        System.out.println("I am buying from " + this.getClass().getSimpleName());
    }
}
