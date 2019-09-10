package patterns.prototype.deepCopy;

import patterns.prototype.shallowCopy.Sheep;

import java.util.Date;

/*Test deep copy
* prototype deep copy*/
public class Client2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(12312321331L);
        Sheep2 s1 = new Sheep2("少礼",date);
        System.out.println(s1);
        System.out.println(s1.getBirthday());
        System.out.println(s1.getName());

        Sheep2 s2 = (Sheep2) s1.clone();
        s1.setName("多利");
        s1.setBirthday(new Date(1241232133L));
        System.out.println(s2);
        System.out.println(s2.getBirthday());
        System.out.println(s2.getName());

        System.out.println(s1);
        System.out.println(s1.getBirthday());
        System.out.println(s1.getName());
        System.out.println();
        System.out.println();  System.out.println(s2);
        System.out.println(s2.getBirthday());
        System.out.println(s2.getName());

    }


}
