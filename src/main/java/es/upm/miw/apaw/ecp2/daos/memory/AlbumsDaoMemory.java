package es.upm.miw.apaw.ecp2.daos.memory;

import es.upm.miw.apaw.ecp2.daos.AlbumsDao;
import es.upm.miw.apaw.ecp2.entities.Album;

import java.time.LocalDateTime;
import java.util.*;

public class AlbumsDaoMemory extends GenericDaoMemory<Album> implements AlbumsDao {


    @Override
    public void setId(Album album, int id) {
        album.setId(id);
    }
    @Override
    public int getId(Album album){
        return album.getId();
    }

    @Override
    public Album findLastAlbum(){
        Album lastAlbum = null;
        List<Album> listaAlbums = new ArrayList<Album>();
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
        HashMap<Integer, Album> tempMap;
        tempMap = new HashMap<Integer, Album >();
        HashMap<Integer, Album> mapFusion;
        mapFusion = new HashMap<Integer, Album>(map);

        for(int i=0;i<albumsToAdd.size();i++){
            Integer keyInteger = new Integer(albumsToAdd.get(i).getId());
            tempMap.put(keyInteger, albumsToAdd.get(i) );
        }
       mapFusion.putAll(tempMap);
        map = mapFusion;

    }
}

