
package almacen.model;

public class PersonaJuridica extends Cliente {
    
    private String idTributaria;
    private String nit;

    public PersonaJuridica(String idTributaria, String nit, String nombre, String apellidos, String cedula, String direccion, String telefono) {
        super(nombre, apellidos, cedula, direccion, telefono);
        this.idTributaria = idTributaria;
        this.nit = nit;
    }

    public String getIdTributaria() {
        return idTributaria;
    }

    public String getNit() {
        return nit;
    }

    public void setIdTributaria(String idTributaria) {
        this.idTributaria = idTributaria;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
}
