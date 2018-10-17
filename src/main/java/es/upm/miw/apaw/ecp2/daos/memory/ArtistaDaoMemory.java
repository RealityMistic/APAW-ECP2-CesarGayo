package es.upm.miw.apaw.ecp2.daos.memory;

import es.upm.miw.apaw.ecp2.daos.ArtistaDao;
import es.upm.miw.apaw.ecp2.entities.Artista;

import java.util.ArrayList;
import java.util.List;

public class ArtistaDaoMemory extends GenericDaoMemory<Artista> implements ArtistaDao {
    private List<Artista> listaArtistas = new ArrayList<Artista>(map.values());
    @Override
    List<Artista> getArtistaLista(){
        return listaArtistas;

    }

    @Override
    Artista findArtista(int idArtista){
        return map.get(idArtista);
    }
}
