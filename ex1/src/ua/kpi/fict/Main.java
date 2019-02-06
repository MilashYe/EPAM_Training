package ua.kpi.fict;

public class Main {
    public static void main(String[] args) {
        //Initialize
        View view = new View();
        Model model = new Model();

        Controller controller = new Controller(view, model);

        controller.processUser();
    }


}
