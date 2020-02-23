import Controllers.Controller;
import Model.NoteBook;
import Views.View;

public class Main {
    public static void main(String[] args) {
        //Initialization
        Controller controller =
                new Controller(new NoteBook(), new View());
        // Run
        controller.processUser();
    }
}
