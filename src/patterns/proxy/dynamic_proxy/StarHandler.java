package patterns.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("#######");
        Object obj = null;
        System.out.println("Here people can do whatever as proxy");
        if(method.getName().equals("sing")) {
            obj = method.invoke(realStar, args);
            System.out.println("here people can call real conductor");
        }
        return obj;
    }
}
