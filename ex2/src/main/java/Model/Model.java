package Model;

import java.util.Random;

public class Model {


    private int guessNumber;
    private int numberOfAttempts;

    private int rangeMin, rangeMax;

    public Model() {
        numberOfAttempts = 0;
        rand();

    }


    public void rand(int min, int max) {
        rangeMin = min;
        rangeMax = max;
        Random rnd = new Random();
        guessNumber = rnd.nextInt(max - min - 1) + min + 1;
    }

    public void rand() {
        rand(Constants.RAND_MIN, Constants.RAND_MAX);
    }



    public boolean checkAnswer(int input) {
        if ( input == guessNumber ) {
            numberOfAttempts++;
            return true;
        }
        if ( input > guessNumber ) {
            rangeMax = input;
            numberOfAttempts++;
        }
        if ( input < guessNumber ) {
            rangeMin = input;
            numberOfAttempts++;
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




}
