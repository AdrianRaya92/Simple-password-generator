/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campostextos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Adrian Raya Hernandez 50888999G
 */
public class CampoTextoController implements Initializable {

    @FXML
    public TextField txtDNI;
    @FXML
    public TextField txtApellidos;
    @FXML
    public TextField txtNombre;

    String dato1, dato2, dato3, contrasena;

    /**
     * Función contrasena()
     * Es la encargada de recibir los campos de textos y con substring coger las
     * partes que queremos, ponerlos en mayúsculas y unirlos en un solo String
     */
    public void contrasena(){
        dato1 = txtNombre.getText();
        dato2 = txtApellidos.getText();
        dato3 = txtDNI.getText();
        String contrasena1 = dato1.substring(0,1);
        String contrasena2 = dato2.substring(0,3);
        String contrasena3 = dato3.substring(dato3.length()-4);

        contrasena = contrasena1.toUpperCase() + contrasena2.toUpperCase()
                + contrasena3.toUpperCase();
    }
    
    /**
     * 
     * @return Nos devuelve un String con el resultado de la contrasena tras las operaciones
     * anteriores
     */
    public String getContrasena(){
       return contrasena;
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
