
package ArrayList1.Disquera;

public class Disco {
//atributos
    private String nombre; 
    private Integer noVentas;
//constructor
    public Disco(String nombre, Integer noVentas) {
        this.nombre = nombre;
        this.noVentas = noVentas;
    }
//métodos de instancia
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNoVentas() {
        return noVentas;
    }

    public void setNoVentas(Integer noVentas) {
        this.noVentas = noVentas;
    }

    @Override
    public String toString() {
        return nombre;
    }


}
