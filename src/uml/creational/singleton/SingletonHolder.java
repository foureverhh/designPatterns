package uml.creational.singleton;

public class SingletonHolder {
    //private static String outSideSource = "HH";
    private static class SingletonInnerHolder{
        private static SingletonHolder instance = new SingletonHolder();
        //static String insideSource =  "hh";
    }

    private SingletonHolder(){
        System.out.println(this.getClass().getSimpleName() + " creates an instance.");
    }

    public static SingletonHolder getInstance(){
        return SingletonInnerHolder.instance;
    }

    public void showInstanceInfo(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Instance is " + getInstance());
    }
}
