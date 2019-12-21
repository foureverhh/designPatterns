package uml.structurial.proxy.dynamicProxy.proxyHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
    Object realSubject;

    public ProxyHandler(Object realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy handler is called");
        Object ret = method.invoke(realSubject,args);
        System.out.println("Proxy now is the agent of " + realSubject.getClass().getSimpleName());
        return ret;
    }
}
