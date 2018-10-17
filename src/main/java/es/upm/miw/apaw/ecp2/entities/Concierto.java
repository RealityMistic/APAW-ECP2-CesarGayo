import java.time.LocalDateTime;

public class ConciertoNodoHoja extends PromocionComponent {
    int duracionEnMinutos;
    String nombre;
    double precio;

    public ConciertoNodoHoja(int idPromocion, LocalDateTime momentoPromocion,
                             String local, String ciudad, int duracionEnMinutos,
                             String nombre, double precio) {
        super(idPromocion, momentoPromocion, local, ciudad);
        this.duracionEnMinutos = duracionEnMinutos;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void view(){

        System.out.println("Código de la promoción-concierto: " + Integer.toString(idPromocion) );
    }

    @Override
    public boolean isComposite(){
        return false;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
