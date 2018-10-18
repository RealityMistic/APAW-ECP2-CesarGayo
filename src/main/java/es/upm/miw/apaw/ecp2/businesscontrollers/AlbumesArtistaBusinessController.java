package es.upm.miw.apaw.ecp2.businesscontrollers;

import es.upm.miw.apaw.ecp2.daos.AgenteDao;
import es.upm.miw.apaw.ecp2.daos.AlbumsDao;
import es.upm.miw.apaw.ecp2.daos.ArtistaDao;
import es.upm.miw.apaw.ecp2.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.dtos.AgenteDto;
import es.upm.miw.apaw.ecp2.dtos.AlbumDto;
import es.upm.miw.apaw.ecp2.dtos.ArtistaDto;
import es.upm.miw.apaw.ecp2.entities.Agente;
import es.upm.miw.apaw.ecp2.entities.Artista;
import es.upm.miw.apaw.ecp2.entities.Album;
import es.upm.miw.apaw.ecp2.entities.GeneroMusical;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

public class AlbumesArtistaBusinessController {

    public List<Album> convertListaDtoToAlbums(List<AlbumDto> listaAlbumDto){
        Iterator<AlbumDto> it = listaAlbumDto.iterator();
        Album album = new Album(1, LocalDateTime.now(), GeneroMusical.POP);
        List<Album> albumesDevolver =null;
        while (it.hasNext()){

            album.setId( it.next().getId());
            album.setFechaLanzamiento( it.next().getFechaLanzamiento());
            album.setGeneroMusical (it.next().getGeneroMusical());
            albumesDevolver.add(album);
        }
        return albumesDevolver;
    }
    public void addAlbumes(int idArtista, List<AlbumDto> listaAlbumDto) {

        AlbumsDao albumsDao = DaoFactory.getFactory().getAlbumsDao();
        List<Album> listaAlbumesInsertar = convertListaDtoToAlbums(listaAlbumDto);
        albumsDao.addAlbums(listaAlbumesInsertar);
        ArtistaDao artistaDao = DaoFactory.getFactory().getArtistaDao();
        Artista artista = artistaDao.findArtista(idArtista);

        artista.setSusAlbumes(listaAlbumesInsertar);
        artistaDao.setArtista(idArtista, artista);
    }
}
