package Controllers;


import Model.NoteBook;
import Views.View;

import java.util.Scanner;

public class Controller {
    NoteBook noteBook;
    View view;

    public Controller(NoteBook noteBook, View view) {
        this.noteBook = noteBook;
        this.view = view;
    }
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        NoteBook noteBook = new NoteBook();
        //UtilityMethod.inputWithScanner(sc);
        InputNoteNoteBook inputNoteNoteBook =
                new InputNoteNoteBook(noteBook, view, sc);
        noteBook  =  inputNoteNoteBook.inputNote();
    }
}
