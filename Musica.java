
package ArrayList1.Disquera;


public class Musica {

    public static void main(String[] args) {
        Disquera Codiscos = new Disquera();
        //----------------------------------------------------------------------
        Cantante NickyJam = new Cantante("Nicky Jam", "dh_105");
        Disco Miami = new Disco("Miami", 20000);
        Disco Amante = new Disco("El amante", 500000);
        NickyJam.agregarDisco(Miami);
        NickyJam.agregarDisco(Amante);
        
        //----------------------------------------------------------------------
        Cantante Elder = new Cantante("Elder Dayan", "dh_106");
        Disco Descontrol = new Disco("Descontrol total", 20000);
        Disco Conquistador = new Disco("Conquistador", 500000);
        Elder.agregarDisco(Descontrol);
        Elder.agregarDisco(Conquistador);
        
        //----------------------------------------------------------------------
        Cantante Koffee = new Cantante("Koffee El Cafetero", "dh_108");
        Disco Tambor = new Disco("El tambor", 20000);
        Disco Chicle = new Disco("El chicle", 526000);
        Koffee.agregarDisco(Tambor);
        Koffee.agregarDisco(Chicle);
        
        //----------------------------------------------------------------------       
        Cantante Felipe = new Cantante("Felipe Pelaez", "dh_121");
        Disco Vestirte = new Disco("Vestirte de amor", 10000);
        Disco Deseos = new Disco("Deseos", 700000);
        Felipe.agregarDisco(Vestirte);
        Felipe.agregarDisco(Deseos);
        
        //----------------------------------------------------------------------
        Cantante Reykon = new Cantante("Reykon", "dh_178");
        Disco Suite = new Disco("La suite", 20000);
        Disco Chisme = new Disco("El chisme", 6000);
        Reykon.agregarDisco(Suite);
        Reykon.agregarDisco(Chisme);
        
        //----------------------------------------------------------------------
        Cantante Jhonny = new Cantante("Jhonny Rivera", "dh_178");
        Disco Tu = new Disco("Tú y yo", 200000);
        Disco Rabia = new Disco("Tengo Rabia Conmigo", 500000);
        Jhonny.agregarDisco(Tu);
        Jhonny.agregarDisco(Rabia);
        
        //----------------------------------------------------------------------
        Codiscos.getCantantes().add(NickyJam);
        Codiscos.getCantantes().add(Elder);
        Codiscos.getCantantes().add(Koffee);
        Codiscos.getCantantes().add(Felipe);
        Codiscos.agregarCantante(Reykon);
        Codiscos.getCantantes().add(Jhonny);
        
        
        //----------------------------------------------------------------------
        //usar métodos
//        System.out.println(Chisme.getNoVentas());
//        Codiscos.CantanteNoVentas("Reykon");
//        Codiscos.CantanteNoVentas("Shakira");
//        Codiscos.buscarCantante("Shakira");
//        Codiscos.buscarCantante("Reykon");
        Codiscos.buscarDisco("Hola");
    }
    
}
