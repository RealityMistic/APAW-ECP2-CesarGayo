package es.upm.miw.apaw.ecp2.daos.memory;

import es.upm.miw.apaw.ecp2.daos.AlbumDao;
import es.upm.miw.apaw.ecp2.entities.Album;

import java.util.List;
import java.util.stream.Collectors;

public class AlbumDaoMemory extends GenericDaoMemory<Album> implements AlbumDao {

    @Override
    public String getId(Album album) {
        return album.getId();
    }

    @Override
    public void setId(Album album, String id) {
        album.setId(id);
    }

    @Override
    public List<Album> findLastAlbum() {
        return
                /* ESto hay que sustituirlo por una función que recorra la lista y devuelva el último
                por fecha
                 */
                /*
                this.findAll().stream()
                .filter(album -> !album.getVotes().isEmpty())
                .collect(Collectors.toList());
                */
    }
}
{
}
