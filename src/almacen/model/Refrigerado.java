/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen.model;

public class Refrigerado extends Producto{
    
    private int codigoAprobacion;
    private float temperaturaRecomendada;

    public Refrigerado(int codigoAprobacion, float temperaturaRecomendada, int codigo, String nombre, String descripcion, double valorUnitario, int existente) {
        super(codigo, nombre, descripcion, valorUnitario, existente);
        this.codigoAprobacion = codigoAprobacion;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public int getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public float getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setCodigoAprobacion(int codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public void setTemperaturaRecomendada(float temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

}
