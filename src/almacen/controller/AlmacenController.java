/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package almacen.controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import almacen.aplication.Aplicacion;
import almacen.model.Almacen;
import almacen.model.Cliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
        listaClientes = FXCollections.observableArrayList();


        this.columnNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnApellido.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        this.columnTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
        this.almacen = aplicacion.getAlmacen();
    }
    @FXML
    private Button btnActualizarCliente;

    @FXML
    private Button btnActualizarProducto;

    @FXML
    private Button btnAgregarCliente;

    @FXML
    private Button btnAgregarProducto;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private Button btnEliminarProducto;

    @FXML
    private Button btnNuevoCliente;

    @FXML
    private Button btnNuevoProducto;

    @FXML
    private TableColumn<Cliente, String>columnNombre;

    @FXML
    private TableColumn<Cliente, String> columnApellido;

    @FXML
    private TableColumn<Cliente, String> columnTelefono;

    @FXML
    private TableView<Cliente> tableViewClientes;

    @FXML
    private TextField txtApellidoCliente;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCodigoProducto;

    @FXML
    private TextField txtDescripcionProducto;

    @FXML
    private TextField txtExistenciasProducto;

    @FXML
    private TextField txtNombreCliente;

    @FXML
    private TextField txtNombreProducto;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtValorProducto;

    private ObservableList<Cliente> listaClientes;



    @FXML
    void actualizarCliente(ActionEvent event) {

    }

    @FXML
    void actualizarProducto(ActionEvent event) {

    }

    @FXML
    void agregarCliente(ActionEvent event) {
        String nombre = txtNombreCliente.getText();
        String apellidos = txtApellidoCliente.getText();
        int telefono = Integer.parseInt(this.txtTelefono.getText());
        int idCliente = Integer.parseInt(this.txtCedula.getText());
        String direccion = txtDescripcionProducto.getText();

        Cliente c = new Cliente(nombre, apellidos, idCliente, direccion, telefono);

        if (!this.listaClientes.contains(c)) {
            this.listaClientes.add(c);
            this.tableViewClientes.setItems(listaClientes);
        }

    }

    @FXML
    void agregarProducto(ActionEvent event) {

    }

    @FXML
    void eliminarCliente(ActionEvent event) {

    }

    @FXML
    void eliminarProducto(ActionEvent event) {

    }
    

}
