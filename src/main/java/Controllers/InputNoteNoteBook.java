package Controllers;

import Views.View;

import java.util.Scanner;


public class InputNoteNoteBook implements RegexContainer{
    private View view;
    private Scanner sc;

    private String login;
    private String password;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityMethod utilityController =
                new UtilityMethod(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.login =
                utilityController.inputStringValueWithScanner
                        (View.INPUT_LOGIN_DATA, REGEX_LOGIN);
        this.password =
                utilityController.inputStringValueWithScanner
                        (View.INPUT_PASSWORD_DATA, REGEX_PASSWORD);
    }
}