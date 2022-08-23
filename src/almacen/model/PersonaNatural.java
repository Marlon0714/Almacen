
package almacen.model;




public class PersonaNatural extends Cliente{
    
    private String email;
    private String fechaNacimiento;

    public PersonaNatural(String email, String fechaNacimiento, String nombre, String apellidos, String cedula, String direccion, String telefono) {
        super(nombre, apellidos, cedula, direccion, telefono);
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
