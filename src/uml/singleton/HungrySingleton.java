package uml.singleton;

public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public void showMyInfo(){
        System.out.println("Hungry instance is: " + this.getClass().getSimpleName() + ", " + hungrySingleton);
    }
}
