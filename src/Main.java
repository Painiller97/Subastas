
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pues4Aula4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Juan", 100);
        Usuario user2 = new Usuario("Pedro", 150);
        Usuario user3 = new Usuario("Enrique", 300);
        
        Subasta subasta1 = new Subasta("Teléfono Movil", user1);
        subasta1.abrirPuja();
        subasta1.pujar(user2, 100);
        
        System.out.println(subasta1.getPujaMayor());
        subasta1.pujar(user3, 100);
        System.out.println(subasta1.getPujaMayor());
        subasta1.ejecutar(user1);
        subasta1.pujar(user3, 200);
        Subasta subasta2 = new Subasta("Impresora Laser", user2);
        subasta2.pujar(user3);
        subasta2.ejecutar(user2);
        
    }
    
}
