package patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*测试反射和反序列化破解*/
public class Client2 {
    public static void main(String[] args) throws ClassNotFoundException
            , NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {
        SingletonDemo06 instance1 = SingletonDemo06.getInstance();
        SingletonDemo06 instance2 = SingletonDemo06.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);


        //Destroy singleton by class reflection
        Class<SingletonDemo06> clazz=(Class<SingletonDemo06>) Class.forName("patterns.singleton.SingletonDemo06");
        Constructor<SingletonDemo06> c =clazz.getDeclaredConstructor((null));
        c.setAccessible(true);
        SingletonDemo06 s3 = c.newInstance();
        SingletonDemo06 s4 = c.newInstance();
        System.out.println(s3);
        System.out.println(s4);

        //Destroy singleton by deserialization


    }
}
