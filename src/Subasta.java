
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
        this.listaPujas = new ArrayList<Puja>();
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

    @Override
    public String toString() {
        return "Subasta{" + "producto=" + producto + ", propietario=" + propietario + ", abierta=" + abierta + ", listaPujas=" + listaPujas + ", pujaMayor=" + pujaMayor + '}';
    }

    public Puja getPujaMayor() {
        System.out.println(this.listaPujas.size());
        return this.listaPujas.get(this.listaPujas.size() - 1);
    }

    public boolean pujar(Usuario user, double cantidad) {
        boolean aceptada = false;
        if (abierta == true
                && cantidad <= user.getCredito()
                && !this.propietario.equals(user)
                && cantidad > this.pujaMayor) {
            Puja p = new Puja(user, cantidad);
            this.listaPujas.add(p);
            aceptada = true;
        } else {
            System.out.println("Puja inválida");
        }

        return aceptada;
    }

    public void pujar(Usuario user) {

        Puja p;
        if (this.listaPujas.size() == 0) {
            p = new Puja(user, 1);
        } else {
            p = new Puja(user, this.getPujaMayor().getCantidad() + 1);
        }
        this.listaPujas.add(p);

    }

    public boolean ejecutar(Usuario user) {
        boolean ejecutada = false;
        if (abierta == true
                && this.listaPujas.size() > 0) {
            this.propietario.incrementaCredito(this.pujaMayor);
            user.decrementaCredito(this.pujaMayor);
            System.out.println(user + " ha ganado la puja por " + this.getPujaMayor().getCantidad());
            abierta = false;
        } else {
            System.out.println("Puja inválida");
        }
        return ejecutada;
    }

    public boolean abrirPuja() {
        if (abierta == false) {
            abierta = true;
        }
        return abierta;
    }
}
