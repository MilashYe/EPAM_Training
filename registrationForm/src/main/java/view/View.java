package view;

import java.util.List;

public class View {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printWrongInput() {
        System.out.println(TextConstants.WRONG_INPUT_MESSAGE);

    }

    public void printAllRecord(List list) {
        for ( Object o : list ) {
            System.out.println(o.toString());
        }
    }
}
