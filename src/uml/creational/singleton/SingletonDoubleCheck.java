package uml.creational.singleton;

public class SingletonDoubleCheck {
    private volatile static SingletonDoubleCheck instance = null;

    private SingletonDoubleCheck(){
        System.out.println(this.getClass().getSimpleName() + " created " + instance);
    }

    public static SingletonDoubleCheck getInstance(){
        if(instance == null){
            synchronized (SingletonDoubleCheck.class){
                if(instance == null){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }

    public void showMyInfo(){
        System.out.println("DoubleCheck instance is: " + this.getClass().getSimpleName() + " , " + instance);
    }
}
