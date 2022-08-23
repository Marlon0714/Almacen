/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen.model;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    
    private int codigoFactura;
    private String fechaFactura;
    private String cliente;
    private float iva;
    private double total;
    private ArrayList<Venta> detallesFactura = new ArrayList<>();

    public Factura(int codigoFactura, String fechaFactura, String cliente, float iva, ArrayList<Venta> detallesFactura) {
        this.codigoFactura = codigoFactura;
        this.fechaFactura = fechaFactura;
        this.cliente = cliente;
        this.iva = iva;
        this.detallesFactura = detallesFactura;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public float getIva() {
        return iva;
    }

    public double getTotal() {
        return total;
    }

    public ArrayList<Venta> getDetallesFactura() {
        return detallesFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDetallesFactura(ArrayList<Venta> detallesFactura) {
        this.detallesFactura = detallesFactura;
    }
    
    
}
