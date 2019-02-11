package Controller;

import Model.Model;
import View.View;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scn = new Scanner(System.in);

        int intAnswer ;

        model.rand(0, 5);

        view.printMessage(View.START_STRING);

        do {
            view.printRange(model.getRangeMin(), model.getRangeMax());
            view.printMessage(View.INPUT_NUMBER_MESSAGE);

            intAnswer = readInput(scn);

            if ( intAnswer > model.getGuessNumber() ) {
                view.printMessage(View.LESS_NUMBER_STRING);
            }else if(intAnswer < model.getGuessNumber()){
                view.printMessage(View.MORE_NUMBER_STRING);
            }

        } while ( !model.checkAnswer(intAnswer) );

        view.printMessage(View.WIN_GAME_MESSAGE);
        view.printStatistic(model.getNumberOfAttempts(),model.getGuessNumber());



    }

    public int readInput(Scanner scanner) {

        String userAnswer = scanner.nextLine();

        while ( !validateInt(userAnswer) ) {
            view.printMessage(View.WRONG_INPUT_MESSAGE);
            view.printRange(model.getRangeMin(), model.getRangeMax());
            view.printMessage(View.INPUT_NUMBER_MESSAGE);
            userAnswer = scanner.nextLine();
        }
        return Integer.parseInt(userAnswer);
    }



    public boolean validateInt(String inp) {
        if ( inp.equals("") ) return false;
        for(int i = 0 ; i < inp.length(); i++) {
            if ( inp.charAt(i) < '0' || inp.charAt(i) > '9' ) {
                return false;
            }
        }
        if ( Integer.parseInt(inp) > model.getRangeMin() &&
                Integer.parseInt(inp) < model.getRangeMax() ) {
            return true;
        }
        return false;
    }


}
