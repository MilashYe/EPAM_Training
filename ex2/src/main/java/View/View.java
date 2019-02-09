package View;

public class View {
    public static final String START_STRING = "Hello! \n " +
            "I want to play a game. \n " +
            "If you want to win, guess the number" +
            "Easy isn't it?";
    public static final String LESS_NUMBER_STRING = "Number less. Try again";
    public static final String MORE_NUMBER_STRING = "Number is more. Try again";
    public static final String WIN_GAME_MESSAGE = "Congratulate! You won!";
    public static final String GAME_OVER_MESSAGE = "WASTED";

    public static final String CHOOSE_LEVEL_OF_DIFFICULTY_MESSAGE =
            "Choose difficult. \n " +
            "Light. Number of attempts = infinity (1, light) \n" +
            "HARDCORE. Number of attempts = 5 (2, hard)";

    public static final String WRONG_INPUT_MESSAGE = "Input is wrong. Input again, please.";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printRange(int min, int max) {
        System.out.println("Guess the number from " + min + " to " + max);
    }

    public void printStatistic(int numberOfAttempt, int answer, String difficult) {
        System.out.println("Your statistic.\n" +
                "Difficult: "+difficult+"\n" +
                "Right answer: "+answer+"\n" +
                "Number of attempt: "+numberOfAttempt);
    }




}
