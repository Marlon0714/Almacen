/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package almacen.controller;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javax.management.Notification;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
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
    ObservableList<Cliente> listaClientes = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {


        this.columnNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnApellido.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        this.columnTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        this.columnId.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        this.columnDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));



        this.tableViewClientes.setItems(listaClientes);
        tableViewClientes.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
        if(newSelection != null){
            clienteSeleccion = newSelection;
            mostarInformacion();
        }
        });




    }
    private void mostarInformacion() {
        if(clienteSeleccion != null){
            txtNombreCliente.setText(clienteSeleccion.getNombre());
            txtApellidoCliente.setText(clienteSeleccion.getApellido());
            txtCedula.setText(clienteSeleccion.getCedula());
            txtTelefono.setText(clienteSeleccion.getTelefono());
            txtDireccion.setText(clienteSeleccion.getDireccion());

        }
    }
    private Cliente clienteSeleccion;
    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
        this.almacen = aplicacion.getAlmacen();

        tableViewClientes.getItems().clear();
        tableViewClientes.setItems(getClientes());

    }

    private ObservableList<Cliente> getClientes() {
        listaClientes.addAll(almacen.getClientes());
        return listaClientes;
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
    private TableColumn<Cliente, String> columnNombre;


    @FXML
    private TableColumn<Cliente, String> columnApellido;

    @FXML
    private TableColumn<Cliente, String> columnTelefono;

    @FXML
    private TableColumn<Cliente, String> columnId;

    @FXML
    private TableColumn<Cliente, String> columnDireccion;

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

    @FXML TextField txtDireccion;

    @FXML
    private TextField txtValorProducto;

    @FXML
    private TextField txtidTributaria;

    @FXML
    private TextField txtNitCliente;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtCodigoAprobacion;
    
    @FXML
    private TextField txtTemperaturaRecomendada;

    @FXML
    private TextField txtPesoEnvase;
    
    @FXML
    private DatePicker dateFechaEnvasado;

    @FXML
    private DatePicker dateFechaNacimiento;

    @FXML
    private DatePicker dateFechaVencimiento;

    @FXML
    private MenuItem itemProductoEnvasado;

    @FXML
    private MenuItem itemProductoPerecedero;

    @FXML
    private MenuItem itemProductoRefrigerado;

    @FXML
    private MenuItem itemTipoPersonaJuridica;

    @FXML
    private MenuItem itemTipoPersonaNatural;

    @FXML
    private MenuItem itemArgentina;

    @FXML
    private MenuItem itemColombia;

    @FXML
    private MenuItem itemChile;

    @FXML
    private MenuItem itemEcuador;

    @FXML
    private MenuItem itemPeru;

    @FXML
    private MenuButton mnBtnPaisOrigen;

    @FXML
    private MenuButton mnBtnTipoPersona;

    @FXML
    private MenuButton mnBtnTipoProducto;



    

    @FXML
    void actualizarProducto(ActionEvent event) {

    }

    @FXML
    void agregarCliente(ActionEvent event) {

        String nombre = txtNombreCliente.getText();
        String apellido = txtApellidoCliente.getText();
        String telefono =txtTelefono.getText();
        String cedula = txtCedula.getText();
        String direccion = txtDireccion.getText();
        String tipoPersona = mnBtnTipoPersona.getText();
        String idTributaria = null;
        String nit = null;
        String email = null;
        String fechaNacimiento = null;

        if(tipoPersona.equals(itemTipoPersonaJuridica.getText())){
            idTributaria = txtidTributaria.getText();
            nit = txtNitCliente.getText();
        }else if(tipoPersona.equals(itemTipoPersonaNatural.getText())){
            email = txtEmail.getText();
            fechaNacimiento = dateFechaNacimiento.getValue().toString();
        }


        if(datosValidos(nombre, apellido, cedula, direccion, telefono) == true){
            listaClientes.add(new Cliente(nombre, apellido, cedula,direccion, telefono));
            //Cliente c = new Cliente(nombre, apellidos, idCliente, direccion, telefono);
            this.aplicacion.añadirCliente(nombre, apellido, cedula,direccion, telefono, email, fechaNacimiento, idTributaria, nit);
        }
    }
    private void añadirCliente(String nombre, String apellido, String cedula, String direccion, String telefono, String email, String fechaNacimiento, String idTributaria, String nit) {

        if(aplicacion.añadirCliente(nombre, apellido, cedula,direccion, telefono, email, fechaNacimiento, idTributaria, nit)){
            mostrarMensaje("Notificaión","El cliente se ha añadido","El cliente se añadió correctamente");
        };
    }
    private boolean datosValidos(String nombre, String apellidos, String idCliente, String direccion, String telefono) {
        String notificacion = "";
        if (nombre == null || nombre.equals("")) {
            notificacion += "Nombre no puede estar vacío\n";
            mostrarMensaje("Notificación","Error", "Informacion inválida");
            return false;
        }
        if (apellidos == null || apellidos.equals("")) {
            notificacion += "Apellido no puede estar vacío\n";
            mostrarMensaje("Notificación","Error", "Informacion inválida");
            return false;
        }
        if (idCliente == null || idCliente.equals("")) {
            notificacion += "Cédula no puede estar vacía\n";
            mostrarMensaje("Notificación","Error", "Informacion inválida");
            return false;
        }
        if (direccion == null || direccion.equals("")) {
            notificacion += "La dirección no puede estar vacía\n";
            mostrarMensaje("Notificación","Error", "Informacion inválida");
            return false;
        }

        if(notificacion.equals("")){
            mostrarMensaje("Notificacion","Clieente registrado" , "El cliente se ha registrado correctamente");
            return true;}


        return false;
    }

    private void mostrarMensaje(String titulo,String header,String contenido)  {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(titulo);
        alert.setHeaderText(header);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
    @FXML
    void actualizarCliente(ActionEvent event) {
        String nombre = txtNombreCliente.getText();
        String apellidos = txtApellidoCliente.getText();
        String telefono = txtTelefono.getText();
        String cedula = txtCedula.getText();
        String direccion = txtDireccion.getText();

        if(clienteSeleccion != null) {
            if(datosValidos(nombre, apellidos, cedula, direccion, telefono) == true){
                aplicacion.actualizarCliente(nombre, apellidos, cedula, direccion, telefono);
                clienteSeleccion.setNombre(nombre);
                clienteSeleccion.setApellido(apellidos);
                clienteSeleccion.setCedula(cedula);
                clienteSeleccion.setDireccion(direccion);
                clienteSeleccion.setTelefono(telefono);
                tableViewClientes.refresh();
            }

        }else{
            mostrarMensaje("Notificación","Error","No se ha seleccionado ningún cliente");
        }
    }
    @FXML
    void agregarProducto(ActionEvent event) {

    }

    @FXML
    void eliminarCliente(ActionEvent event) {
        if(clienteSeleccion != null){
            listaClientes.remove(clienteSeleccion);
            if(aplicacion.eliminarCliente(clienteSeleccion.getCedula())){
                mostrarMensaje("Notificación","El cliente no se ha eliminado","El cliente no se pudo eliminar correctamente");
            }
            else{
                mostrarMensaje("Notificación","El cliente se ha eliminado","El cliente se ha eliminado correctamente");
            }
        }
        else{
            mostrarMensaje("Notificación","Error","No se ha seleccionado ningún cliente");
        }
    }

    @FXML
    void eliminarProducto(ActionEvent event) {

    }


    @FXML
    void selectPersonaJuridica(ActionEvent event) {
        mnBtnTipoPersona.setText(itemTipoPersonaJuridica.getText());
        selectTipoPersona(event);
    }

    @FXML
    void selectPersonaNatural(ActionEvent event) {
        mnBtnTipoPersona.setText(itemTipoPersonaNatural.getText());
        selectTipoPersona(event);
    }

    @FXML
    void selectTipoPersona(ActionEvent event) {
        txtNitCliente.setVisible(false);
        txtidTributaria.setVisible(false);
        txtEmail.setVisible(false);
        dateFechaNacimiento.setVisible(false);

        if(mnBtnTipoPersona.getText().equals(itemTipoPersonaJuridica.getText())){
            txtNitCliente.setVisible(true);
            txtidTributaria.setVisible(true);
        }else if(mnBtnTipoPersona.getText().equals(itemTipoPersonaNatural.getText())){
            txtEmail.setVisible(true);
            dateFechaNacimiento.setVisible(true);
        }

    }

    @FXML
    void selectTipoProducto(ActionEvent event) {
        mnBtnPaisOrigen.setVisible(false);
        txtPesoEnvase.setVisible(false);
        dateFechaEnvasado.setVisible(false);
        dateFechaVencimiento.setVisible(false);
        txtCodigoAprobacion.setVisible(false);
        txtTemperaturaRecomendada.setVisible(false);

        if(mnBtnTipoProducto.getText().equals(itemProductoEnvasado.getText())){
            mnBtnPaisOrigen.setVisible(true);
            txtPesoEnvase.setVisible(true);
            dateFechaEnvasado.setVisible(true);
        }else if(mnBtnTipoProducto.getText().equals(itemProductoPerecedero.getText())){
            dateFechaVencimiento.setVisible(true);
        }else if(mnBtnTipoProducto.getText().equals(itemProductoRefrigerado.getText())){
            txtCodigoAprobacion.setVisible(true);
            txtTemperaturaRecomendada.setVisible(true);
        }
    }

    @FXML
    void selectProductoEnvasado(ActionEvent event) {
        mnBtnTipoProducto.setText(itemProductoEnvasado.getText());
        selectTipoProducto(event);
    }

    @FXML
    void selectProductoPerecedero(ActionEvent event) {
        mnBtnTipoProducto.setText(itemProductoPerecedero.getText());
        selectTipoProducto(event);
    }

    @FXML
    void selectProductoRefrigerado(ActionEvent event) {
        mnBtnTipoProducto.setText(itemProductoRefrigerado.getText());
        selectTipoProducto(event);
    }

    @FXML
    void selectArgentina(ActionEvent event) {
        mnBtnPaisOrigen.setText(itemArgentina.getText());
    }

    @FXML
    void selectChile(ActionEvent event) {
        mnBtnPaisOrigen.setText(itemChile.getText());
    }

    @FXML
    void selectColombia(ActionEvent event) {
        mnBtnPaisOrigen.setText(itemColombia.getText());
    }

    @FXML
    void selectEcuador(ActionEvent event) {
        mnBtnPaisOrigen.setText(itemEcuador.getText());
    }

    @FXML
    void selectPeru(ActionEvent event) {
        mnBtnPaisOrigen.setText(itemPeru.getText());
    }

}
