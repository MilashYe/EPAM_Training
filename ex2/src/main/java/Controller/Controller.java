package Controller;

import Model.Model;
import View.View;

public class Controller {

    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        view.printMessage(View.START_STRING);

        int userAnswer;

    }


}
