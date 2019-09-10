package patterns.prototype.shallowCopy;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep s1 = new Sheep("少理",new Date(12312321331L));
        System.out.println(s1);
        //Shallow copy
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s2);
    }
}
