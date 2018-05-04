
import java.util.Scanner;


public class Usuario {

    private String nombre;

    private int credito;

    public Usuario(String nombre, int credito) {
        this.nombre = nombre;
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int incrementaCredito(int creditomas){
      Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuanto quieres incrementar el crédito?");
        creditomas = sc.nextInt();
        credito = credito + creditomas;
        return credito;
    }
    
    public int decrementaCredito(int creditomenos){
      Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuanto quieres incrementar el crédito?");
        creditomenos = sc.nextInt();
        credito = credito - creditomenos;
        return credito;
    }

}
