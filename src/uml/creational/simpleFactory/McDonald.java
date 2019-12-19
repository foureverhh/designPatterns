package uml.creational.simpleFactory;

public class McDonald {
    public IFood getFood(String name){
        switch (name){
            case "chip":
                return new Chips();
            case "chicken":
                return new McChicken();
            default:
                System.out.println("Can not make");
                return null;
        }
    }
}
