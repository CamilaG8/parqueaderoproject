module co.edu.uniquindio.parqueaderoproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens co.edu.uniquindio.parqueaderoproject to javafx.fxml;
    exports co.edu.uniquindio.parqueaderoproject;
    exports co.edu.uniquindio.parqueaderoproject.controller;
    opens co.edu.uniquindio.parqueaderoproject.controller to javafx.fxml;
    opens co.edu.uniquindio.parqueaderoproject.model.classes;
}