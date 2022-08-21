
package almacen.model;

public class Producto {
    
    private int codigoProducto;
    private String nombre;
    private String descripcion;
    private double valorUnitario;
    private int existente;

    public Producto(int codigoProducto, String nombre, String descripcion, double valorUnitario, int existente) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
        this.existente = existente;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getExistente() {
        return existente;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setExistente(int existente) {
        this.existente = existente;
    }
    
}
