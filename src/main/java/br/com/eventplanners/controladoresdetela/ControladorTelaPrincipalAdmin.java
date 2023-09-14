package br.com.eventplanners.controladoresdetela;

import br.com.eventplanners.controladores.ControladorDeCena;
import javafx.fxml.FXML;

import java.io.IOException;

public class ControladorTelaPrincipalAdmin {
    @FXML
    protected void cronogramaOrganizador() throws IOException {
        System.out.println("Cronograma Organizador");
        ControladorDeCena.trocarCena("tela-cronograma-organizador.fxml");
    }
}
