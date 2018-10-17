package es.upm.miw.apaw.ecp2.daos;

import es.upm.miw.apaw.ecp2.entities.Album;

import java.util.List;

    public interface AlbumDao extends GenericDao<Album, String> {
        List<Album> findLastAlbum();
    }

}
