
package almacen.model;

import java.util.Date;

public class Perecedero extends Producto{
    
    private Date fechaVencimiento;

    public Perecedero(Date fechaVencimiento, int codigo, String nombre, String descripcion, double valorUnitario, int existente) {
        super(codigo, nombre, descripcion, valorUnitario, existente);
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
}
