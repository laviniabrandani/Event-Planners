module br.com.sistemabancario {
    requires javafx.controls;
    requires javafx.fxml;

    exports br.com.sistemabancario.main;
    opens br.com.sistemabancario.main to javafx.fxml;
    exports br.com.sistemabancario.controladoresdetela;
    opens br.com.sistemabancario.controladoresdetela to javafx.fxml;
}