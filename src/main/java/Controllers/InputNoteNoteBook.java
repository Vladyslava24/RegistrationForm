package Controllers;

import Model.Address;
import Model.NoteBook;
import Views.View;

import java.util.Scanner;


public class InputNoteNoteBook implements RegexContainer{
    private NoteBook noteBook;
    private View view;
    private Scanner sc;

    public InputNoteNoteBook(NoteBook noteBook, View view, Scanner sc) {
        this.noteBook = noteBook;
        this.view = view;
        this.sc = sc;
    }

    public NoteBook inputNote() {
        NoteBook noteBook = new NoteBook();
        Address address = new Address();
        UtilityMethod utilityController =
                new UtilityMethod(sc, view);

        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        String comment = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_COMMENT : REGEX_COMMENT_UKR;
        String ad = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_ADDRESS_UKR : REGEX_ADDRESS;

        noteBook.setName(utilityController.inputStringValueWithScanner
                        (View.INPUT_NAME_DATA, str));
        noteBook.setSurname(utilityController.inputStringValueWithScanner
                        (View.INPUT_SURNAME_DATA, str));
        noteBook.setPatronymic(utilityController.inputStringValueWithScanner
                        (View.INPUT_PATRONYMIC_DATA, str));
        String fullName = view.printFormName(noteBook.getSurname(), noteBook.getName());
        view.printMessage(fullName);
        noteBook.setLogin(utilityController.inputStringValueWithScanner
                        (View.INPUT_LOGIN_DATA, REGEX_LOGIN));
        noteBook.setPassword(utilityController.inputStringValueWithScanner
                        (View.INPUT_PASSWORD_DATA, REGEX_PASSWORD));
        noteBook.setComment(utilityController.inputStringValueWithScanner
                        (View.INPUT_COMMENT_DATA, comment));
        noteBook.setMail(utilityController.inputStringValueWithScanner
                        (View.INPUT_MAIL_DATA, REGEX_MAIL));
        noteBook.setHomePhone(utilityController.inputStringValueWithScanner
                        (View.INPUT_HOME_PHONE_DATA, REGEX_HOME_PHONE));
        noteBook.setMobilePhone(utilityController.inputStringValueWithScanner
                        (View.INPUT_MOBILE_PHONE_DATA, REGEX_MOBILE_PHONE));
        address.setIndex(utilityController.inputStringValueWithScanner
                        (View.INPUT_INDEX_DATA, REGEX_INDEX));
        address.setCity(utilityController.inputStringValueWithScanner
                        (View.INPUT_CITY_DATA, ad));
        address.setStreet(utilityController.inputStringValueWithScanner
                        (View.INPUT_STREET_DATA, ad));
        address.setHomeNumber(utilityController.inputStringValueWithScanner
                        (View.INPUT_HOME_NUMBER_DATA, REGEX_HOME_NUMBER));
        address.setFlatNumber(utilityController.inputStringValueWithScanner
                        (View.INPUT_FLAT_NUMBER_DATA, REGEX_FLAT_NUMBER));
        noteBook.setAddress(address);
        String add = view.getAdress(address.getIndex(), address.getCity(), address.getStreet(),
                address.getHomeNumber(), address.getFlatNumber());
        view.printStringInput(View.ADRESS_INPUT_DATA);
        view.printMessage(add);
        noteBook.setDate(utilityController.inputStringValueWithScanner
                        (View.INPUT_DATE_DATA, REGEX_DATE));
        return noteBook;
    }
}