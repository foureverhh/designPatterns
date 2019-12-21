package uml.structurial.proxy.dynamicProxy;

import uml.structurial.proxy.dynamicProxy.concreteClasses.KFC;
import uml.structurial.proxy.dynamicProxy.concreteClasses.MiStore;
import uml.structurial.proxy.dynamicProxy.interfaces.IKFC;
import uml.structurial.proxy.dynamicProxy.interfaces.IMiSeller;
import uml.structurial.proxy.dynamicProxy.proxyHandler.ProxyHandler;

import static java.lang.reflect.Proxy.newProxyInstance;
//https://youtu.be/Qg8tTLHFtTk
public class Client {
    public static void main(String[] args) {
        System.out.println("This is dynamic proxy client");
        IKFC kfc = (IKFC) newProxyInstance(Client.class.getClassLoader(),
                new Class[]{IKFC.class},
                new ProxyHandler(new KFC()));
        kfc.eat();

        IMiSeller miSeller = (IMiSeller) newProxyInstance(Client.class.getClassLoader(),
                MiStore.class.getInterfaces(),
                new ProxyHandler(new MiStore()));
        miSeller.buy();
    }
}
