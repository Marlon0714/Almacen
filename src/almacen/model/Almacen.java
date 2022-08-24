
package almacen.model;


import java.util.ArrayList;

public class Almacen {
    
    private String nombre;
    private String nit;

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<Factura> facturas = new ArrayList<>();

    public Almacen(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        //Crear tres clientes
        Cliente cliente1 = new Cliente("Juan", "Perez", "12345678", "Calle 1", "12345678");
        Cliente cliente2 = new Cliente("Pedro", "Gomez", "87654321", "Calle 2", "87654321");
        Cliente cliente3 = new Cliente("Maria", "Lopez", "98765432", "Calle 3", "98765432");
        //Agregar clientes al almacen
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        //Crear dos perecederos, dos refirgerados y dos envasados
        Producto perecedero1 = new Producto("Perecedero 2", "1", "Perecedero 1", 100.0, "10");
        Producto perecedero2 = new Producto("Perecedero 1", "2", "Perecedero 2", 200.0, "20");
        Producto refrigerado1 = new Producto("Refrigerado 1", "12", "Refrigerado 1", 300.0, "30");
        Producto refrigerado2 = new Producto("Refirgerado 2", "2", "Refrigerado 2", 400.0, "40");
        Producto envasado1 = new Producto("Envasado 1", "1", "Envasado 1", 500.0, "50");
        Producto envasado2 = new Producto("Envasado 2", "2", "Envasado 2", 600.0, "60");
        //Agregar productos al almacen
        productos.add(perecedero1);
        productos.add(perecedero2);
        productos.add(refrigerado1);
        productos.add(refrigerado2);
        productos.add(envasado1);
        productos.add(envasado2);

    }

    public String getNombre() {
        return nombre;
    }
    public String getNit() {
        return nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    public void agregarCliente(String nombre, String apellido, String cedula, String direccion, String telefono, String email, String fechaNacimiento, String idTributaria, String nit) {

        Cliente cliente = new Cliente(nombre, apellido, cedula, direccion, telefono);

        if(email == null && fechaNacimiento == null){
            cliente = new PersonaJuridica(idTributaria, nit, nombre, apellido,cedula,direccion,telefono);
        }else if(idTributaria == null && nit == null){
            cliente = new PersonaNatural(email, fechaNacimiento,nombre, apellido,cedula,direccion,telefono);
        }
        clientes.add(cliente);
    }

    public boolean eliminarcliente(String cedula){ {
        boolean flagEliminado = false;
        do {
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getCedula().equals(cedula)) {
                    clientes.remove(i);
                    flagEliminado = true;

                }
            }
            } while (flagEliminado == false);
        return flagEliminado;
        }
    }

    public void modificarCliente(String nombre2, String apellidos, String cedula, String direccion, String telefono) {
        Cliente cliente = new Cliente(nombre, apellidos, cedula, direccion, telefono);
        int pos = obtenerPosicionCliente(cedula);
        clientes.set(pos, cliente);
        
    }
    public int obtenerPosicionCliente(String cedula){
        int posicion = 0;
        boolean flagEncontrado = false;
        do {
            for(int i = 0; i < clientes.size(); i++){
                if (clientes.get(i).getCedula().equals(cedula)) {
                    posicion = i;
                    flagEncontrado = true;
                }
            }
            posicion = -1;
        }while(flagEncontrado == false && posicion == 0);
    return posicion;
    }
    public int obtenerPosicionProducto(String codigoProducto){
        int pos = 0;
        boolean flagEncontrado = false;
        do {
            for(int i = 0; i < productos.size(); i++){
                if (productos.get(i).getCodigoProducto().equals(codigoProducto)) {
                    pos = i;
                    flagEncontrado = true;
                }
                pos = -1;
            }
        }while(flagEncontrado == false && pos == 0);
        return pos;

    }
    public void modificarProducto(String nombreProducto, String codigoProducto, String descripcion,double valorUnitario, String existencias){
        Producto producto = new Producto(nombreProducto, codigoProducto, descripcion, valorUnitario, existencias);
        int pos = obtenerPosicionProducto(codigoProducto);
        productos.set(pos, producto);
    }
    public void añadirProducto(String nombreProducto, String codigoProducto, String descripcion, double valorUnitario, String existencias) {
        Producto producto = new Producto(nombreProducto, codigoProducto, descripcion, valorUnitario, existencias);
        productos.add(producto);
    }

    public boolean eliminarProducto(String codigoProducto) {
        boolean flagEliminado = false;
        do {
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getCodigoProducto().equals(codigoProducto)) {
                    productos.remove(i);
                    flagEliminado = true;

                }
            }
            } while (flagEliminado == false);
        return flagEliminado;
    }

    public void agregarVenta(Producto producto, int cantidadProducto){
        
        
    }

}
