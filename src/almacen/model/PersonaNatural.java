/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen.model;

import java.util.Date;


public class PersonaNatural extends Cliente{
    
    private String email;
    private Date fechaNacimiento;

    public PersonaNatural(String email, Date fechaNacimiento, String nombre, String apellidos, int idCliente, String direccion, int telefono) {
        super(nombre, apellidos, idCliente, direccion, telefono);
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
