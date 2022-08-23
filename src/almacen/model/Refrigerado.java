
package almacen.model;

public class Refrigerado extends Producto{
    
    private String codigoAprobacion;
    private float temperaturaRecomendada;

    public Refrigerado(String codigoAprobacion, float temperaturaRecomendada, String codigo, String nombre, String descripcion, double valorUnitario, String existente) {
        super(codigo, nombre, descripcion, valorUnitario, existente);
        this.codigoAprobacion = codigoAprobacion;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public float getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public void setTemperaturaRecomendada(float temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

}
