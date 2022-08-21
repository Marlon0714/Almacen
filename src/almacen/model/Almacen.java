
package almacen.model;

public class Almacen {
    
    private String nombre;
    private int nit;

    public Almacen(String nombre, int nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

}
