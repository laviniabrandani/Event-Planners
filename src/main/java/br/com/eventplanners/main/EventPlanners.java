package br.com.eventplanners.main;

import br.com.eventplanners.controladores.ControladorDeCena;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class EventPlanners extends Application {
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