package Controllers;

import Model.Model;
import Views.View;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        //UtilityMethod.inputWithScanner(sc);
        InputNoteNoteBook inputNoteNoteBook =
                new InputNoteNoteBook(view, sc);
        inputNoteNoteBook.inputNote();

    }
}
