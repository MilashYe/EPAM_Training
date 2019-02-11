package Controller;

import Model.Model;
import View.View;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Scanner;

import static org.junit.Assert.*;

public class ControllerTest {

    private Controller controller = new Controller(new Model(), new View());

    @Test
    public void readInput() {
        String number = "12";
        int result = controller.readInput(new Scanner(number));
        assertEquals(12, result);

    }
    @Test
    public void validateInt() {

        String wrongNumber = "asdf";
        assertFalse(controller.validateInt(wrongNumber));
    }


}