package uml.dependecy_inversion_principle;

public class Mother {
    //public void read(Book book){
    public void read(IReader iReader){
        System.out.println("Mom is reading");
        iReader.getContent();
    }
}
