package uml.structurial.adapter.classAdapter;

import uml.structurial.adapter.classAdapter.adapter.PowerAdapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("This is a Class adapter.");
        NoteBook noteBook = new NoteBook();
        noteBook.PowerOn(new PowerAdapter());
    }
}
