package patterns.singleton;

public class SingletonDemo02 {
    //懒汉式
    private static SingletonDemo02 instance;

    private SingletonDemo02(){

    }
    //懒汉式必须使用synchronized关键字来确保线程安全
    public static synchronized SingletonDemo02 getInstance(){
        if(null==instance){
            instance = new SingletonDemo02();
        }
        return instance;
    }
}
