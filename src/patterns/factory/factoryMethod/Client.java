package patterns.factory.factoryMethod;

public class Client {
    public static void main(String[] args) {
        Car audi = new AudiFactory().createCar();
        Car byd = new BydFactory().createCar();
        audi.run();
        byd.run();
        Car benz = new BenzFactory().createCar();
        benz.run();
    }
}
