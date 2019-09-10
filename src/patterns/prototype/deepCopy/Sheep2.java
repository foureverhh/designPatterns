package patterns.prototype.deepCopy;

import java.util.Date;

public class Sheep2 implements Cloneable{
    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();

        //To realise deep clone
        Sheep2 s=(Sheep2) object;
        s.birthday = (Date) this.birthday.clone();
        return s;
    }

    public Sheep2(String name, Date birthday) {
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
