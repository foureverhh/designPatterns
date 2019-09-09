package patterns.factory.simpleFactory;
/*Not factory pattern*/
public class ClientCommon { //Client01 is the caller 调用者
    public static void main(String[] args) {
        Car audi = new Audi();
        Car byd = new Byd();
        audi.run();
        byd.run();
    }

}
