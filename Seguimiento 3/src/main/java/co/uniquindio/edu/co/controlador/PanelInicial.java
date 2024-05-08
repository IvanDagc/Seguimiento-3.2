package co.uniquindio.edu.co.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class PanelInicial {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button CambiarEstado;

    @FXML
    private Button ConsultarEnvio;

    @FXML
    private Button CrearEnvio;

    @FXML
    private TableView<?> Informacion;

    @FXML
    void initialize() {
        assert CambiarEstado != null : "fx:id=\"CambiarEstado\" was not injected: check your FXML file 'panelInicial.fxml'.";
        assert ConsultarEnvio != null : "fx:id=\"ConsultarEnvio\" was not injected: check your FXML file 'panelInicial.fxml'.";
        assert CrearEnvio != null : "fx:id=\"CrearEnvio\" was not injected: check your FXML file 'panelInicial.fxml'.";
        assert Informacion != null : "fx:id=\"Informacion\" was not injected: check your FXML file 'panelInicial.fxml'.";

    }

}

