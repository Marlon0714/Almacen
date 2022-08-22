
package almacen.aplication;

import almacen.controller.AlmacenController;
import almacen.model.Almacen;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author pulgi
 */
public class Aplicacion extends Application {
    
	private Stage primaryStage;
        private Almacen almacen = new Almacen(null, null);
        

	@Override
	public void start (Stage primaryStage) throws Exception {
		
            this.primaryStage = primaryStage;
            this.primaryStage.setTitle("Almacen");
            mostrarVentanaPrincipal();
	}
    
    public void mostrarVentanaPrincipal(){

        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Aplicacion.class.getResource("/almacen/view/AlmacenView.fxml"));
            AnchorPane root = (AnchorPane) loader.load();

            AlmacenController almacenController = loader.getController();
            almacenController.setAplicacion(this);

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public Almacen getAlmacen() {
        return almacen;
    }
    public boolean añadirCliente(String nombre, String apellido, String cedula, String direccion, int telefono){
        almacen.agregarCliente(nombre, apellido, cedula, direccion, telefono);
        return false;
    }
    public static void main(String[] args) {
        launch(args);
    }

    public boolean eliminarCliente(String cedula) {
        boolean eliminarcliente = almacen.eliminarcliente(cedula);
        return false;
    }

    public void actualizarCliente(String nombre, String apellidos, String cedula, String direccion, int telefono) {
        almacen.modificarCliente(nombre,apellidos,cedula, direccion, telefono);
    }
    
}
