package patterns.singleton;

public class SingletonDemo01 {
    //饿汉式，类初始化，立即加载这个对象（没有延时构造的优势）
    //由于加载类时，天然线程安全
    private static SingletonDemo01 instance = new SingletonDemo01();


    private SingletonDemo01() {

    }

    //getInstance 不需要synchronized关键字，因此执行效率高
    public static SingletonDemo01 getInstance() {
        return instance;
    }
}
