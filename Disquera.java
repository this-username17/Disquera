package ArrayList1.Disquera;

import java.util.ArrayList;

public class Disquera {
//atributos

    private ArrayList<Cantante> cantantes = new ArrayList();
//setters and getters

    public ArrayList<Cantante> getCantantes() {
        return cantantes;
    }

    public void setCantantes(ArrayList<Cantante> cantantes) {
        this.cantantes = cantantes;
    }
//métodos de instancia

    //agrega un cantante a la lista de cantantes de la disquera
    public void agregarCantante(Cantante cantante) {
        cantantes.add(cantante);
    }

    //método buscar un cantante por el nombre
    public void buscarCantante(String cantanteaBuscar) {
        boolean verificador = false;
        for (int i = 0; i < cantantes.size(); i++) {
            Cantante Cantante = cantantes.get(i);
            if (Cantante.getNombre().equalsIgnoreCase(cantanteaBuscar)) {
                verificador = true;
                System.out.println("Se encontró el cantante: " + cantanteaBuscar);
                break;
            } else {
                verificador = false;
            }
        }
        if (verificador == false) {
            System.out.println("No se encontró el cantante: " + cantanteaBuscar);
        }
    }

    //método - se busca el nombre del cantante e imprime el número de ventas 
    public void CantanteNoVentas(String cantanteaBuscar) {
        boolean verificador = false;
        for (int i = 0; i < cantantes.size(); i++) {
            Cantante cantante1 = cantantes.get(i);
            Integer suma = 0;
            if (cantante1.getNombre().equalsIgnoreCase(cantanteaBuscar)) {
                verificador = true;
                Integer sumaVentas;
                for (Disco q : cantante1.getDiscos()) {
                    suma += q.getNoVentas();
                }
                System.out.println(cantanteaBuscar + " tiene: " + suma + " discos vendidos");
                break;
            }

        }
        if (verificador == false) {
            System.out.println("El cantante: " + cantanteaBuscar + ", no se encontró");
        }
    }
//método para buscar Discos entre todos los cantantes de la disquera
    public void buscarDisco(String nombreDisco) {
        String FraseDisco = null;
        Cantante cantante1 = new Cantante();
        for (int i = 0; i < cantantes.size(); i++) {
            cantante1 = cantantes.get(i);
            FraseDisco = cantante1.buscarDisco(nombreDisco);
            if (FraseDisco == "Se encontró el disco") {
                break;
            } 
        }
            if (FraseDisco == "Se encontró el disco") {
            String NombreCantante = cantante1.getNombre();
            System.out.println(FraseDisco+": "+nombreDisco+". Cantante: " + NombreCantante);
            }
            else {System.out.println(FraseDisco+": "+nombreDisco);}
        

    }
}
