package patterns.factory.simpleFactory;

public class CarFactory {
    //Style 1
    public static Car createCar(String type){
        if("Audi".equals(type)) {
            return new Audi();
        }else if("Byd".equals(type)){
            return new Byd();
        }else{
            return null;
        }
    }

    //Style 2
    public static Car createAudi(){
        return new Audi();
    }

    public static Car createByd(){
        return new Byd();
    }
}
