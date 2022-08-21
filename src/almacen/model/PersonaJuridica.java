/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen.model;

public class PersonaJuridica extends Cliente {
    
    private int idTributaria;
    private int nit;

    public PersonaJuridica(int idTributaria, int nit, String nombre, String apellidos, int idCliente, String direccion, int telefono) {
        super(nombre, apellidos, idCliente, direccion, telefono);
        this.idTributaria = idTributaria;
        this.nit = nit;
    }

    public int getIdTributaria() {
        return idTributaria;
    }

    public int getNit() {
        return nit;
    }

    public void setIdTributaria(int idTributaria) {
        this.idTributaria = idTributaria;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
    
}
