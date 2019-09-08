package patterns.singleton;

import java.io.Serializable;

public class SingletonDemo06 implements Serializable {
    private static SingletonDemo06 instance;

    private SingletonDemo06(){
        //In case of using reflection to destroy singleton
        //Constructor to throw exception when trying to construct another instance
        if(null!=instance){
            throw new RuntimeException();
        }
    }

    public static synchronized SingletonDemo06 getInstance(){
        if(instance==null){
            instance = new SingletonDemo06();
        }
        return instance;
    }
    //Take care of deserialization destroy singleton
    private Object readResolve(){
        //instead of the object we deserialized
        //return the class variable INSTANCE
        return instance;
    }
}
