package es.upm.miw.apaw.ecp2.dtos;

import es.upm.miw.apaw.ecp2.entities.GeneroMusical;

import java.time.LocalDateTime;

public class AlbumDto {
    int id;
    LocalDateTime fechaLanzamiento;
    GeneroMusical generoMusical;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDateTime fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public GeneroMusical getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(GeneroMusical generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    public String toString() {
        return "Album{" +
                "fecha de lanzamiento=" + fechaLanzamiento.toString() +
                ", genero='" + generoMusical + '\'' +'}';
    }
}
