package controller;

import model.Notebook;
import view.TextConstants;
import view.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private Notebook notebook;
    private View view;

    private ArrayList<String> record = new ArrayList<String>();

    private Scanner scn = new Scanner(System.in);

    public Controller(Notebook notebook, View view) {
        this.notebook = notebook;
        this.view = view;
    }

    public void addRecord() {
        view.printMessage(TextConstants.START_MESSAGE);

/*        record.add(readInput(TextConstants.INPUT_FIRST_NAME, Regex.NAME_REGEX));
        record.add(readInput(TextConstants.INPUT_LAST_NAME, Regex.NAME_REGEX));
        record.add(readInput(TextConstants.INPUT_NICKNAME, Regex.NICKNAME_REGEX));
        record.add(readInput(TextConstants.INPUT_COMMENT, Regex.COMMENT_REGEX));
        record.add(readInput(TextConstants.INPUT_HOME_PHONE, Regex.HOME_PHONE_REGEX));
        record.add(readInput(TextConstants.INPUT_MOBILE_PHONE, Regex.MOBILE_PHONE_REGEX));
        record.add(readInput(TextConstants.INPUT_SECOND_MOBILE_PHONE, Regex.MOBILE_PHONE_REGEX));
        record.add(readInput(TextConstants.INPUT_EMAIL, Regex.EMAIL_REGEX));
        record.add(readInput(TextConstants.INPUT_SKYPE, Regex.SKYPE_REGEX));
        record.add(readInput(TextConstants.INPUT_ADDRESS_INDEX, Regex.ADDRESS_INDEX_REGEX));
        record.add(readInput(TextConstants.INPUT_ADDRESS_CITY, Regex.ADDRESS_CITY_REGEX));
        record.add(readInput(TextConstants.INPUT_ADDRESS_STREET, Regex.ADDRESS_STREET_REGEX));
        record.add(readInput(TextConstants.INPUT_ADDRESS_HOUSE_NUMBER, Regex.HOUSE_NUMBER_REGEX));
        record.add(readInput(TextConstants.INPUT_ADDRESS_APARTMENT_NUMBER, Regex.APARTMENT_NUMBER_REGEX));*/
        record.add(readInput(TextConstants.INPUT_DATE, Regex.DATE_REGEX));



    }

    public String readInput(String text, String regex) {
        view.printMessage(text);
        String input = scn.nextLine();
        while ( !(validate(regex, input)) ) {
            view.printMessage(TextConstants.WRONG_INPUT_MESSAGE);
            view.printMessage(text);
            input = scn.nextLine();
        }
        return input;
    }

    public boolean validate(String regex, String validationInput) {
        return validationInput.matches(regex);
    }
}
