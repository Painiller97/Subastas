
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

    @Override
    public String toString() {
        return nombre;
    }
    
    
    public void incrementaCredito(int creditomas){
        credito += creditomas;
    }
    
    public void decrementaCredito(int creditomenos){
        credito -= creditomenos;
    }

}
