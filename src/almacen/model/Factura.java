/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen.model;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    
    private int codigoFactura;
    private Date fechaFactura;
    private Cliente cliente;
    private float iva;
    private double total;
    private ArrayList<Venta> detallesFactura = new ArrayList<>();

    public Factura(int codigoFactura, Date fechaFactura, Cliente cliente, float iva, ArrayList<Venta> detallesFactura) {
        this.codigoFactura = codigoFactura;
        this.fechaFactura = fechaFactura;
        this.cliente = cliente;
        this.iva = iva;
        this.detallesFactura = detallesFactura;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public Cliente getCliente() {
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

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public void setCliente(Cliente cliente) {
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
