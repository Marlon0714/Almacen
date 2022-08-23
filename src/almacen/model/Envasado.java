
package almacen.model;



public class Envasado extends Producto{
    
    private String fechaEnvasado;
    private float pesoEnvasado;
    private String paisOrigen;

    public Envasado(String fechaEnvasado, float pesoEnvasado, String paisOrigen, String codigo, String nombre, String descripcion, double valorUnitario, String existente) {
        super(codigo, nombre, descripcion, valorUnitario, existente);
        this.fechaEnvasado = fechaEnvasado;
        this.pesoEnvasado = pesoEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public float getPesoEnvasado() {
        return pesoEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setPesoEnvasado(float pesoEnvasado) {
        this.pesoEnvasado = pesoEnvasado;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
}
