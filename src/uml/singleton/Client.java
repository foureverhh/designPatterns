package uml.singleton;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is singleton");
        //饿汉式
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        hungrySingleton.showMyInfo();

        //懒汉式
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.showMyInfo();

        Thread.sleep(500);
        new Thread(new TestSingleton()).start();
    }
}
