package uml.structurial.proxy.dynamicProxy.concreteClasses;

import uml.structurial.proxy.dynamicProxy.interfaces.IKFC;

public class KFC implements IKFC {
    @Override
    public void eat() {
        System.out.println("I am eating at " + this.getClass().getSimpleName());
    }
}
