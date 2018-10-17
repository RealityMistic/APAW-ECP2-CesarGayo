import java.time.LocalDateTime;
import java.time.Month;

public class Album {
    LocalDateTime fechaLanzamiento;
    GeneroMusical generoMusical;

    public GeneroMusical getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(GeneroMusical generoMusical) {
        this.generoMusical = generoMusical;
    }

    public LocalDateTime getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int anio, Month mes, int diaDelMes, int hora, int minuto) {
        this.fechaLanzamiento = LocalDateTime.of(anio, mes, diaDelMes, hora, minuto);
    }
}
