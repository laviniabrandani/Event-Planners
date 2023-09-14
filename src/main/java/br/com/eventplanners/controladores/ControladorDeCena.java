package br.com.eventplanners.controladores;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorDeCena {
    private static Stage stage;

    public static void setStage(Stage stage) {
        ControladorDeCena.stage = stage;
    }

    public static void trocarCena(String caminhoFXML) throws IOException {
        FXMLLoader loader = new FXMLLoader(ControladorDeCena.class.getResource("/br/com/eventplanners/" + caminhoFXML));
        Parent root = loader.load();
        stage.setTitle("Event Planners");
        stage.setMinWidth(800);
        stage.setMinHeight(600);
        stage.setScene(new Scene(root));
    }
}
