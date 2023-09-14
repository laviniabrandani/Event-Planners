module br.com.sistemabancario {
    requires javafx.controls;
    requires javafx.fxml;

    exports br.com.eventplanners.main;
    opens br.com.eventplanners.main to javafx.fxml;
    exports br.com.eventplanners.controladoresdetela;
    opens br.com.eventplanners.controladoresdetela to javafx.fxml;
}