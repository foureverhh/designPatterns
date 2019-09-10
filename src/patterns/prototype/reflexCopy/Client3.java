package patterns.prototype.reflexCopy;

import patterns.prototype.shallowCopy.Sheep;

import java.io.*;
import java.util.Date;

public class Client3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Date date = new Date(1231232133L);
        Sheep3 s1 = new Sheep3("多利",date);
        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getBirthday());
        System.out.println();
        //Using serialization and deserialization to deep copy
        //Serialize to a byte array
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();


        //deserialize from byte array to object
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep3 s2 = (Sheep3) ois.readObject();

        //deserialize by FileInputStream an FileInputStream
        File sheepFile = sheepSerialization(s1);
        Sheep3 s3 = sheepDeserialization(sheepFile);

        date.setTime(23432432423L);
        System.out.println(s1.getBirthday());
        s2.setName("多多利");
        System.out.println("All about s2:");
        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getBirthday());

        System.out.println();
        s3.setName("s3");
        System.out.println(s3);
        System.out.println(s3.getName());
        System.out.println(s3.getBirthday());

    }

    private static File sheepSerialization(Sheep3 sheep){
        File file = new File("sheep.txt");
        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(sheep);
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    private static Sheep3 sheepDeserialization(File file){
        Sheep3 s = null;
        try(FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis)){
             s = (Sheep3) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return s;
    }
}
