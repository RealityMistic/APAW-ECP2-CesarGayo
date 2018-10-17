package es.upm.miw.apaw.ecp2.daos;

import es.upm.miw.apaw.ecp2.entities.Album;
import es.upm.miw.apaw.ecp2.entities.Artista;

import java.util.List;

    public interface ArtistaDao extends GenericDao<Album, String> {
        List<Artista> getAristaLista();
        Artista findArtista();
    }
}
