package uml.singleton;

public class TestSingleton implements Runnable{
    HungrySingleton hungrySingleton;
    LazySingleton lazySingleton;

    public TestSingleton() {
    }

    @Override
    public void run() {
        hungrySingleton = HungrySingleton.getInstance();
        lazySingleton = LazySingleton.getInstance();
        System.out.println("Hungry: " + hungrySingleton + " ,Lazy: " + lazySingleton);
    }
}
