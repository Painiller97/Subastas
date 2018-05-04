public class Puja {

    private Usuario usuario;

    private int cantidad;

    public Puja(Usuario usuario, int cantidad) {
        this.usuario = usuario;
        this.cantidad = cantidad;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
