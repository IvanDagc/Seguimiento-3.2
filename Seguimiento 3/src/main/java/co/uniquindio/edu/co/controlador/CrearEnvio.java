package co.uniquindio.edu.co.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CrearEnvio {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AgregarEnvio;

    @FXML
    private Button Crear;

    @FXML
    private TextField Peso;

    @FXML
    private ComboBox<?> TipoEnvio;

    @FXML
    private TableView<?> tablaValor;

    @FXML
    void Agregar(ActionEvent event) {

    }

    @FXML
    void crear(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert AgregarEnvio != null : "fx:id=\"AgregarEnvio\" was not injected: check your FXML file 'crearEnvio.fxml'.";
        assert Crear != null : "fx:id=\"Crear\" was not injected: check your FXML file 'crearEnvio.fxml'.";
        assert Peso != null : "fx:id=\"Peso\" was not injected: check your FXML file 'crearEnvio.fxml'.";
        assert TipoEnvio != null : "fx:id=\"TipoEnvio\" was not injected: check your FXML file 'crearEnvio.fxml'.";
        assert tablaValor != null : "fx:id=\"tablaValor\" was not injected: check your FXML file 'crearEnvio.fxml'.";

    }

}
