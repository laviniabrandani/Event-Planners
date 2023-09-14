package br.com.sistemabancario.controladoresdetela;

import br.com.sistemabancario.controladores.ControladorDeCena;
import javafx.fxml.FXML;

import java.io.IOException;

public class ControladorTelaPrincipalAdmin {
    @FXML
    protected void cronogramaOrganizador() throws IOException {
        System.out.println("Cronograma Organizador");
        ControladorDeCena.trocarCena("tela-cronograma-organizador.fxml");
    }
}
