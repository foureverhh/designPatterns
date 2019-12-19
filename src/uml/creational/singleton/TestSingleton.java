package uml.creational.singleton;

public class TestSingleton implements Runnable{
    HungrySingleton hungrySingleton;
    LazySingleton lazySingleton;

    public TestSingleton() {
    }

    @Override
    public void run() {
        hungrySingleton = HungrySingleton.getInstance();
        try {
            lazySingleton = LazySingleton.getInstance();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hungry: " + hungrySingleton + " ,Lazy: " + lazySingleton);
    }
}
