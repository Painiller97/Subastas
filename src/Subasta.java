
import java.util.ArrayList;

public class Subasta {

    private String producto;

    private Usuario propietario;

    private boolean abierta;

    private ArrayList<Puja> listaPujas;

    private int pujaMayor;

    public Subasta(String producto, Usuario propietario) {
        this.producto = producto;
        this.propietario = propietario;
        this.pujaMayor = 0;
    }

    public String getProducto() {
        return producto;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public ArrayList<Puja> getListaPujas() {
        return listaPujas;
    }

    public Puja getPujaMayor() {
        return null;
    }

    public boolean pujar(Usuario user, double cantidad) {
        boolean aceptada=false;
        if  (    abierta == true &&
                cantidad <= user.getCredito() &&
                !this.propietario.equals(user) &&
                cantidad>this.pujaMayor
            ) {
            Puja p = new Puja(user,cantidad);
            this.listaPujas.add(p);
            aceptada=true;
        } 
        else{
            System.out.println("La puja está cerrada");
        }
            
        return aceptada;
    }
    
    public void pujar(Usuario user) {
        
        Puja p =new Puja(user,this.getPujaMayor().getCantidad()+1);
        this.listaPujas.add(p);
                
    }

    public boolean ejecutar(Usuario user) {
        boolean ejecutada=false;
       if (
             abierta==true &&
             this.listaPujas.size() > 0
              ){
           this.propietario.incrementaCredito(this.pujaMayor);
           user.decrementaCredito(this.pujaMayor);
           abierta = false;
       }
       return ejecutada;
    }
}
