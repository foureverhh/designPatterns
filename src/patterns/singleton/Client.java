package patterns.singleton;

public class Client  {
    public static void main(String[] args) {
        //Test demo1
        SingletonDemo01 singletonDemo01a = SingletonDemo01.getInstance();
        SingletonDemo01 singletonDemo01b = SingletonDemo01.getInstance();
        System.out.println(singletonDemo01a);
        System.out.println(singletonDemo01b);

    }

    public void showTest(){

    }
}
