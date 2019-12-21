package uml.structurial.adapter.instanceAdapter;

import uml.structurial.adapter.instanceAdapter.adapee.Power220V;
import uml.structurial.adapter.instanceAdapter.adapter.PowerAdapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is object Adapter");
        NoteBook noteBook = new NoteBook();
        noteBook.PowerOn(new PowerAdapter(new Power220V()));
    }
}
