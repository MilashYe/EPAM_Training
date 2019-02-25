package controller;

import model.Registration.Record;
import view.TextConstants;
import view.View;

import java.util.ArrayList;
import java.util.Scanner;

public class RecordReader {

    private View view;
    private Scanner scn;



    public RecordReader(View view, Scanner scn) {
        this.view = view;
        this.scn = scn;
    }

    public Record inputRecord(int count) {
        ArrayList<String> record = new ArrayList<String>();
        while ( !checkForIntegrity(record,count) ) {
            record.add(readInput(TextConstants.INPUT_FIRST_NAME, Regex.NAME_REGEX));
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
            record.add(readInput(TextConstants.INPUT_ADDRESS_APARTMENT_NUMBER, Regex.APARTMENT_NUMBER_REGEX));
            record.add(readInput(TextConstants.INPUT_DATE, Regex.DATE_REGEX));

            if ( !checkForIntegrity(record,count) ) {
                view.printMessage(TextConstants.WRONG_INPUT_MESSAGE);
            }
        }



        return new Record(record);
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

    public int inputInt(String string, String message,  String regex) {
        while ( !checkNum(string, regex) ) {
            view.printMessage(TextConstants.WRONG_INPUT_MESSAGE);
            view.printMessage(message);

        }
        return Integer.parseInt(string);
    }

    public boolean validate(String regex, String validationInput) {
        return validationInput.matches(regex);
    }

    public boolean checkForIntegrity(ArrayList<String> arrayList, int countOfLines) {
        return arrayList.size() == countOfLines;
    }

    public boolean checkNum(String string, String regex) {
        return string.matches(regex);
    }

}
