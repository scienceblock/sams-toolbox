package app.sambennett.toolbox;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class PrimaryController {
    @FXML private Text detailsText;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void getDetails() throws IOException {
        System.out.println(System.getProperty("user.name"));
        detailsText.setText(GetDetails.get());
    }
}
