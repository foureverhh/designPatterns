package patterns.factory.simpleFactory;
/*Simple Factory pattern*/
public class ClientFactory { //Client01 is the caller 调用者
    public static void main(String[] args) {
       /*
       //No factory
       Car audi = new Audi();
        Car byd = new Byd();
        audi.run();
        byd.run();
        */
       //With factory
       Car audi = CarFactory.createCar("Audi");
       Car byd = CarFactory.createCar("Byd");
       audi.run();
       byd.run();
    }

}
