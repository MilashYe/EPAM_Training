package ua.kpi.fict;

/*
 * Created by Yevhenii Milashevskyi by 06.02.2019
 *
 */

import java.util.Scanner;

public class Controller {

    private View view;
    private Model model;

    //Construstor

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;

    }

    //Run
    public void processUser() {
        readData();
    }

    // Reading data
    private void readData() {

        String hello = "";
        String world = "";
        boolean helloValidated = false;
        boolean worldValidated = false;
        boolean done = false;


        Scanner scanner = new Scanner(System.in);
        do {
            view.printMessage(View.INPUT_HELLO_MESSAGE);
            hello = scanner.nextLine();

            while ( !(helloValidated = validation(hello, "Hello")) ) {
                view.printMessage(View.WRONG_INPUT_MESSAGE);
                view.printMessage(View.INPUT_HELLO_MESSAGE);
                hello = scanner.nextLine();
            }



            view.printMessage(View.INPUT_WORLD_MESSAGE);
            world = scanner.nextLine();

            while ( !(worldValidated =validation(world, "World!")) ) {
                view.printMessage(View.WRONG_INPUT_MESSAGE);
                view.printMessage(View.INPUT_WORLD_MESSAGE);
                world = scanner.nextLine();
            }



            if ( helloValidated == true && worldValidated == true ) {

                model.createResult(hello, world);
                view.printMessage(model.getResult());
                done = true;

            } else {
                view.printMessage("Wrong input");
            }
        } while ( !done );

    }

    private boolean validation(String input, String expected) {
        if ( input.equals( expected )) return true;
            else return false;
    }
}
