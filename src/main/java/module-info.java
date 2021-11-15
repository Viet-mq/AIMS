module src.aims {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens src to javafx.fxml;
    exports src;
}