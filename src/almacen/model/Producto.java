
package almacen.model;

public class Producto {
    
    private String codigoProducto;
    private String nombreProducto;
    private String descripcion;
    private double valorUnitario;
    private String existente;

    public Producto(String nombreProducto, String codigoProducto, String descripcion, double valorUnitario, String existente) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
        this.existente = existente;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombre() {
        return nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public String getExistente() {
        return existente;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setNombre(String nombre) {
        this.nombreProducto = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setExistente(String existente) {
        this.existente = existente;
    }


}
