package es.upm.miw.apaw.ecp2.daos;

import es.upm.miw.apaw.ecp2.entities.Album;

import java.util.List;

    public interface AlbumsDao extends GenericDao<Album, String> {
        Album findLastAlbum();
        void addAlbums(List<Album>);

    }

}
