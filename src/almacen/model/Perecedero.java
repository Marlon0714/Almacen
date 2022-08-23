
package almacen.model;



public class Perecedero extends Producto{
    
    private String fechaVencimiento;

    public Perecedero(String fechaVencimiento, String codigo, String nombre, String descripcion, double valorUnitario, String existente) {
        super(codigo, nombre, descripcion, valorUnitario, existente);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
}
