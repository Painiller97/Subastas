
import java.util.ArrayList;

public class Subasta {

    private String producto;

    private Usuario propietario;

    private boolean abierta;

    private ArrayList<Puja> listaPujas;

    private int pujaMayor;

    public Subasta(String producto, Usuario propietario, boolean abierta, ArrayList<Puja> listaPujas, int pujaMayor) {
        this.propietario = propietario;
        this.abierta = abierta;
        this.listaPujas = listaPujas;
        this.pujaMayor = pujaMayor;
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

    public void pujar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void pujar(Usuario user) {
        
        Puja p =new Puja(user,this.getPujaMayor().getCantidad()+1);
    }

    public boolean ejecutar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
