package es.upm.miw.apaw.ecp2.daos.memory;

import es.upm.miw.apaw.ecp2.daos.ArtistaDao;
import es.upm.miw.apaw.ecp2.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.entities.Agente;
import es.upm.miw.apaw.ecp2.entities.Artista;
import es.upm.miw.apaw.ecp2.entities.ArtistaBuilder;
import org.apache.logging.log4j.LogManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArtistaDaoMemory extends GenericDaoMemory<Artista> implements ArtistaDao {
    private List<Artista> listaArtistas;

    public ArtistaDaoMemory() {
        listaArtistas = new ArrayList<Artista>(map.values());
        Artista artistaPrimero = new ArtistaBuilder(
                1,"Ped", "Probador", false,
                new Agente(1, "Pepe", "1212")).buildArtista();
        map.put(1, artistaPrimero);

    }

    @Override
    public List<Artista> getArtistaLista(){
        return listaArtistas;

    }


    @Override
    public Artista findArtista(int idArtista){
       return map.get(idArtista);
    }


    public int getId(Artista artista) {
        Artista miArtista = map.get(artista.getId());
        return miArtista.getId();
    }

    @Override
    public void setId(Artista artista, int id) {
        map.put(id, artista);
    }

}
