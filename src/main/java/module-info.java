module es.unaizugaza {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.unaizugaza to javafx.fxml;
    exports es.unaizugaza;
}
