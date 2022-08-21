
package almacen.model;

import java.util.Date;

public class Envasado extends Producto{
    
    private Date fechaEnvasado;
    private float pesoEnvasado;
    private String paisOrigen;

    public Envasado(Date fechaEnvasado, float pesoEnvasado, String paisOrigen, int codigo, String nombre, String descripcion, double valorUnitario, int existente) {
        super(codigo, nombre, descripcion, valorUnitario, existente);
        this.fechaEnvasado = fechaEnvasado;
        this.pesoEnvasado = pesoEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public float getPesoEnvasado() {
        return pesoEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setPesoEnvasado(float pesoEnvasado) {
        this.pesoEnvasado = pesoEnvasado;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
}
