package es.upm.miw.apaw.ecp2.daos.memory;

import es.upm.miw.apaw.ecp2.daos.AlbumsDao;
import es.upm.miw.apaw.ecp2.entities.Album;

import java.time.LocalDateTime;
import java.util.*;

public class AlbumsDaoMemory extends GenericDaoMemory<Album> implements AlbumsDao {

    @Override
    public String getId(Album album) {
        return album.getId();
    }

    @Override
    public void setId(Album album, String id) {
        album.setId(id);
    }

    @Override
    public Album findLastAlbum(){
        Album lastAlbum;
        List<Album> listaAlbums = new ArrayList<Album>;
        Iterator<Map.Entry<Integer, Album>> it = map.entrySet().iterator();
        while (it.hasNext()) {
             listaAlbums.add((Album) it.next());
            if (lastAlbum == null
                    || ((Album) it.next()).getFechaLanzamiento().isAfter(lastAlbum.getFechaLanzamiento()))
            {
                lastAlbum= ((Album) it.next());
            }
        }
        return lastAlbum;
    }
    @Override
    public void addAlbums(List<Album> albumsToAdd) {
        Map<Long, Album> tempMap = new HashMap<Integer, <Album>>();
        Map<Long, Album> mapFusion = new HashMap<Integer, <Album>>(map);

        for(int i=0;i<albumsToAdd.size();i++){
            tempMap.put(new Integer(albumsToAdd.get(i)), albumsToAdd.get(i) );
        }
       mapFusion.putAll(tempMap);

    }
}

