package patterns.prototype.reflexCopy;

import java.io.Serializable;
import java.util.Date;

public class Sheep3 implements Serializable {


    private String name;
    private Date birthday;

    public Sheep3(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

   /* @Override
    public String toString() {
        return "A sheep with name as "+this.name+" and birthday as "+this.birthday;
    }*/
}
