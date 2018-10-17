package es.upm.miw.apaw.ecp2.entities;

import java.time.LocalDateTime;
import java.time.Month;

public class Album {
    int id;
    LocalDateTime fechaLanzamiento;
    GeneroMusical generoMusical;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
