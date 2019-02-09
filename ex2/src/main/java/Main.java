import Controller.Controller;
import View.View;
import Model.Model;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);

        controller.processUser();
    }
}
