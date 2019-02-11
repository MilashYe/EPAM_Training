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
        String choosedDifficult;
        String userAnswer ;
        int intAnswer ;

        model.rand(0, 25);

        view.printMessage(View.START_STRING);
        view.printMessage(View.CHOOSE_LEVEL_OF_DIFFICULTY_MESSAGE);

        choosedDifficult = readInput(scn);

        while ( !validateDiffficult(choosedDifficult) ) {
            view.printMessage(View.WRONG_INPUT_MESSAGE);
            choosedDifficult = readInput(scn);
        }

        model.setDifficult(choosedDifficult);

        do {
            view.printRange(model.getRangeMin(), model.getRangeMax());
            view.printMessage(View.INPUT_NUMBER_MESSAGE);

            userAnswer = readInput(scn);

            while ( !validateInt(userAnswer) ) {
                view.printMessage(View.WRONG_INPUT_MESSAGE);
                view.printRange(model.getRangeMin(), model.getRangeMax());
                view.printMessage(View.INPUT_NUMBER_MESSAGE);
                userAnswer = readInput(scn);
            }
            intAnswer = Integer.parseInt(userAnswer);

            model.checkAnswer(intAnswer);

            if ( model.getNumberOfAttempts() == 0 ) {
                view.printMessage(View.GAME_OVER_MESSAGE);
                break;
            }

            if ( intAnswer > model.getGuessNumber() ) {
                view.printMessage(View.LESS_NUMBER_STRING);
            }else{
                view.printMessage(View.MORE_NUMBER_STRING);
            }


            if ( model.isAnswer(intAnswer) ) {
                view.printMessage(View.WIN_GAME_MESSAGE);
                view.printStatistic((model.getDifficult()==1)?
                                (Integer.MAX_VALUE-model.getNumberOfAttempts()+1):
                                (6-model.getNumberOfAttempts()),
                        model.getGuessNumber(),
                        model.getDifficultString());
                break;
            }

        } while ( true );




    }

    private String readInput(Scanner scanner) {

        return scanner.nextLine();
    }

    private boolean validateDiffficult(String inp) {
        return inp.equals("1") ||
                inp.equals("2") ||
                inp.equals("light") ||
                inp.equals("hard");
    }

    private boolean validateInt(String inp) {
        if ( inp.equals("") ) return false;
        for(int i = 0 ; i < inp.length(); i++) {
            if ( inp.charAt(i) < '0' || inp.charAt(i) > '9' ) {
                return false;
            }
        }
        if ( Integer.parseInt(inp) >= model.getRangeMin() && Integer.parseInt(inp) <= model.getRangeMax() ) {
            return true;
        }
        return false;
    }


}
