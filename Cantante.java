package ArrayList1.Disquera;

import java.util.ArrayList;

public class Cantante {
//atributos
    private String nombre;
    private String id;
    private ArrayList<Disco> discos = new ArrayList();
//constructor

    public Cantante() {
    }
    
    public Cantante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
//métodos de instancia
    public int noVentasEnSusDiscos() {
        int sumaVentas = 0;
        for (Disco i : discos) {
            sumaVentas += i.getNoVentas();
        }
        return sumaVentas;
    }

    public void agregarDisco(Disco disco) {
        discos.add(disco);
    }
    
    public String buscarDisco(String nombreDisco) {
        boolean match = false;
        for (Disco i : discos) {
            match = i.getNombre().equalsIgnoreCase(nombreDisco);
        }
        if (match == true) {
            return "Se encontró el disco";
        } else {
            return "No se encontró el disco";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Disco> getDiscos() {
        return discos;
    }

    public void setDiscos(ArrayList<Disco> discos) {
        this.discos = discos;
    }

}
