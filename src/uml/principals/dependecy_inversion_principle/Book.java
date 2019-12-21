package uml.principals.dependecy_inversion_principle;

public class Book implements IReader{
    @Override
    public void getContent(){
        System.out.println("阿里巴巴与四十大盗");
    }
}
