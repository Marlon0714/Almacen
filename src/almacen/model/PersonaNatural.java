
package almacen.model;

import java.util.Date;


public class PersonaNatural extends Cliente{
    
    private String email;
    private Date fechaNacimiento;

    public PersonaNatural(String email, Date fechaNacimiento, String nombre, String apellidos, String cedula, String direccion, int telefono) {
        super(nombre, apellidos, cedula, direccion, telefono);
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
