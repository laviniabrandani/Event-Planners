package br.com.sistemabancario.main;

import br.com.sistemabancario.controladores.ControladorDeCena;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SistemaBancario extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ControladorDeCena.setStage(stage);
        ControladorDeCena.trocarCena("tela-login.fxml");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}