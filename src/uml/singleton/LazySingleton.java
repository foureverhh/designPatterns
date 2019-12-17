package uml.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){
    }

    public static synchronized LazySingleton getInstance() throws InterruptedException {
        if(lazySingleton == null){
            Thread.sleep(1000);
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


    public void showMyInfo(){
        System.out.println("Lazy instance is: " + this.getClass().getSimpleName() + " , " + lazySingleton);
    }
}
