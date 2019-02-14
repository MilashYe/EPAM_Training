package view;

public class View {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printWrongInput() {
        System.out.println(TextConstants.WRONG_INPUT_MESSAGE);

    }
}
