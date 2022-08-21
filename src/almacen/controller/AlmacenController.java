/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package almacen.controller;
import java.net.URL;
import java.util.ResourceBundle;

import almacen.aplication.Aplicacion;
import almacen.model.Almacen;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author pulgi
 */
public class AlmacenController implements Initializable {

    private Aplicacion aplicacion;
    private Almacen almacen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
        this.almacen = aplicacion.getAlmacen();
    }
    
}
