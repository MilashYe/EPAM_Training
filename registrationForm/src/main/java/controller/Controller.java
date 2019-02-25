package controller;

import model.Model;
import model.Registration.Notebook;

import view.TextConstants;
import view.View;

import java.util.Scanner;

public class Controller {


    private View view;
    private Model model;

    private Scanner scn ;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void addRecord() {
        final int COUNT_OF_LINES = 15;
        scn = new Scanner(System.in);

        RecordReader reader = new RecordReader(view,scn);

        Notebook notebook = Notebook.getInstance();


        view.printMessage(TextConstants.START_MESSAGE);
        view.printMessage(TextConstants.INPUT_OR_OUTPUT_MESSGE);
        int ioend = reader.inputInt(scn.nextLine(), TextConstants.WRONG_INPUT_MESSAGE, "[123]");
        while ( ioend != 3 ) {
            if ( ioend == 2 ) {
                view.printMessage(notebook.toString());
            }
            if ( ioend == 1 ) {

                notebook.addRecord(reader.inputRecord(COUNT_OF_LINES));
            }
            view.printMessage(TextConstants.INPUT_OR_OUTPUT_MESSGE);
            ioend = reader.inputInt(scn.nextLine(), TextConstants.WRONG_INPUT_MESSAGE, "[123]");
        }




    }


}
