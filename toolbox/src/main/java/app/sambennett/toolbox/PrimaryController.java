package app.sambennett.toolbox;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void outputTest() throws IOException {
        System.out.println(System.getProperty("user.name"));
    }
}
