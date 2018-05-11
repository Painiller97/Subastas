public class Puja {

    private Usuario usuario;

    private double cantidad;

    public Puja(Usuario usuario, double cantidad) {
        this.usuario = usuario;
        this.cantidad = cantidad;
    }
    
    public String getUsuario() {
        return usuario.getNombre();
    }    
    
    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return usuario + "ha pujado" + cantidad;
    }
    
}
