package uml.principals.dependecy_inversion_principle;

public class Newspaper implements IReader{
    @Override
    public void getContent(){
        System.out.println("新闻");
    }
}
