module app.sambennett.toolbox {
    requires javafx.controls;
    requires javafx.fxml;

    opens app.sambennett.toolbox to javafx.fxml;
    exports app.sambennett.toolbox;
}
