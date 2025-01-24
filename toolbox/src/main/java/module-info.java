module app.sambennett.toolbox {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens app.sambennett.toolbox to javafx.fxml;
    exports app.sambennett.toolbox;
}
