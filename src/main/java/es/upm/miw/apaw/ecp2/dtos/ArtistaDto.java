package es.upm.miw.apaw.ecp2.dtos;

import es.upm.miw.apaw.ecp2.entities.Agente;
import es.upm.miw.apaw.ecp2.entities.Album;
import es.upm.miw.apaw.ecp2.entities.ArtistaBuilder;

import java.util.ArrayList;

public class ArtistaDto {

    int idArtista;
    String nombre;
    String pseudonimo;

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }
}
