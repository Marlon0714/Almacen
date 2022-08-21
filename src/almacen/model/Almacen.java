
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
        Cliente cliente1 = new Cliente("Juan", "Perez", "12345678", "Calle 1", 12345678);
        Cliente cliente2 = new Cliente("Pedro", "Gomez", "87654321", "Calle 2", 87654321);
        Cliente cliente3 = new Cliente("Maria", "Lopez", "98765432", "Calle 3", 98765432);
        //Agregar clientes al almacen
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

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

}
