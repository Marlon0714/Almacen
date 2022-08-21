/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package almacen.controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import almacen.aplication.Aplicacion;
import almacen.model.Almacen;
import almacen.model.Cliente;
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
        
        //this.columnNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        //this.columnApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        //this.columnTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));

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
    private TableColumn<Cliente, String> columnNombre;

    @FXML
    private TableColumn<Cliente, String> columnApellido;

    @FXML
    private TableColumn<Cliente, String> columnTelefono;

    @FXML
    private TableView<Cliente> tableViewClientes;

    @FXML
    private TextField txtApellidoCliente;

    @FXML
    private TextField txtcedula;

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
    void actualizarCliente(ActionEvent event) {

    }

    @FXML
    void actualizarProducto(ActionEvent event) {

    }

    @FXML
    void agregarCliente(ActionEvent event) {
        
        String nombre = txtNombreCliente.getText();
        String apellido = txtApellidoCliente.getText();
        String telefono = txtTelefono.getText();
        int cedula = Integer.parseInt(txtcedula.getText());

        
    }

    @FXML
    void agregarProducto(ActionEvent event) {

    }

    @FXML
    void columnNombre(ActionEvent event) {

    }

    @FXML
    void eliminarCliente(ActionEvent event) {

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
