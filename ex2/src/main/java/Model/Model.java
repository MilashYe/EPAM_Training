package Model;

import java.util.Random;

public class Model {

    private final int RAND_MIN = 0;
    private final int RAND_MAX = 100;

    private int guessNumber;

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

    public boolean checkAnswer(int input) {

        if(input == guessNumber){
            return true;
        } else {
            if ( input > guessNumber ) {
                rangeMax = input;
            }
            if ( input < guessNumber ) {
                rangeMin = input;
            }
            return false;
        }
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


}
