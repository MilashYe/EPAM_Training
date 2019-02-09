package Model;

import java.util.Random;

public class Model {

    private final int RAND_MIN = 0;
    private final int RAND_MAX = 100;

    private int guessNumber;
    private int numberOfAttempts;
    private int difficult;
    private int rangeMin, rangeMax;


    public void rand(int min, int max) {
        rangeMin = min;
        rangeMax = max;
        Random rnd = new Random();
        guessNumber = rnd.nextInt(max - min) + min;
    }

    public void rand() {
        rand(RAND_MIN, RAND_MAX);
    }

    public void setDifficult(String difficult) {



        if ( difficult.equals("1") || difficult.equals("light") ) {

            this.difficult = 1;
            numberOfAttempts = Integer.MAX_VALUE;

        } else if ( difficult.equals("2") || difficult.equals("hard") ) {

            this.difficult = 2;
            numberOfAttempts = 5;

        }

    }

    public boolean checkAnswer(int input) {

        if ( input > guessNumber ) {
            rangeMax = input;
            numberOfAttempts--;
        }
        if ( input < guessNumber ) {
            rangeMin = input;
            numberOfAttempts--;
        }
        return false;


    }

    public boolean isAnswer(int inp) {
        if ( inp == guessNumber ) {
            return true;
        }
        return false;
    }

    public int getRangeMin() {
        return rangeMin;
    }

    public int getRangeMax() {
        return rangeMax;
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public String getDifficultString() {
        if ( difficult == 1 ) {
            return "Light";
        } else /*if ( difficult == 2 )*/ {
            return "HARDCORE";
        }
    }

    public int getDifficult() {
        return difficult;
    }


}
