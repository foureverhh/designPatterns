package uml.structurial.adapter.instanceAdapter;

public class NoteBook {
    public void PowerOn(Power12V power12V){
        power12V.getPower12V();
        System.out.println("Notebook is using power 220V");
    }
}
