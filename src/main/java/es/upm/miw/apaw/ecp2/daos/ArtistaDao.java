package es.upm.miw.apaw.ecp2.daos;

import es.upm.miw.apaw.ecp2.entities.Artista;

import java.util.List;

    public interface ArtistaDao extends GenericDao<Artista> {
        List<Artista> getArtistaLista();
        Artista findArtista(int idArtista);
        void setArtista(int idArtista, Artista artista);
    }

