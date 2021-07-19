package ditarea3;

import campostextos.CampoTextoController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author Adrián Raya Hernández 
 */
public class FXMLDocumentController implements Initializable {

    //Inicializamos los TextField que tenemos creados con nuestro FXMLDocument
    @FXML
    private TextField txtContrasena;
    
    @FXML
    private CampoTextoController campController;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    /**
     * 
     * @param event 
     * Es el evento del botón Generear contraseña
     * Este evento recoge los datos String que escribimos en los TextField
     * Cuando se recogen los datos se utiliza substring para coger las partes del String que queremos
     * Concatenamos los substring en un solo String y con tuUpperCase lo transformamos en mayúsculas
     * Todo ello se realiza llamando al campController y su función contrasena() y recibiendo el valor
     * de getContrasena()
     */
    @FXML
    private void GenerarContrasena(ActionEvent event) {
        campController.contrasena();
        txtContrasena.appendText(campController.getContrasena());  
    }

    /**
     * 
     * @param event 
     * Evento del botón de Nuevos Datos
     * Se encarga de poner todos los TextField vacío, por lo que introducimos setText vacíos
     */
    @FXML
    private void NuevosDatos(ActionEvent event) {
        campController.txtNombre.setText("");
        campController.txtApellidos.setText("");
        campController.txtDNI.setText("");
        txtContrasena.setText("");
    }

    /**
     * 
     * @param event 
     * Evento del botón salir
     * Cuando se clickea saldrá de la ventana de la aplicación
     */
    @FXML
    private void Salir(ActionEvent event) {
        System.exit(0);
    }
    
}
