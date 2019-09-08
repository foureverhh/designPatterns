package patterns.singleton;
/*
*使用内部静态类来创建静态instance
*只有调用内部类时，才会创建线程安全的instance
*/


public class SingletonDemo03{
    //不需要静态实例，而是创建内部静态类
    private static class SingletonDemo03Instance{
        private static SingletonDemo03 instance = new SingletonDemo03();
    }

    private SingletonDemo03(){

    }

    public static SingletonDemo03 getInstance(){
        return SingletonDemo03Instance.instance;
    }

}
