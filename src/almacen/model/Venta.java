/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen.model;

public class Venta {
    
    private Producto producto;
    private int cantidadProducto;
    private double subTotal;

    public Venta(Producto producto, int cantidadProducto) {
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
        this.subTotal = calcularSubtotal();
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
    public double calcularSubtotal() {
        double subTotal = cantidadProducto * producto.getValorUnitario();
        return subTotal;
    }

}
