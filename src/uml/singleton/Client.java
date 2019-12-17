package uml.singleton;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is singleton");
      /*  //饿汉式
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        hungrySingleton.showMyInfo();*/
        new Thread(()->{
            //懒汉式
            LazySingleton lazySingleton = null;
            try {
               LazySingleton.getInstance().showMyInfo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        //Thread.sleep(4000);
        //new Thread(new TestSingleton()).start();
/*
        new Thread(()->{
                //饿汉式
                HungrySingleton hungrySingletonRun = HungrySingleton.getInstance();
                hungrySingletonRun.showMyInfo();
        }).start();*/


        //懒汉式
        LazySingleton.getInstance().showMyInfo();
    }
}
