package es.upm.miw.apaw.ecp2.daos.memory;

import es.upm.miw.apaw.ecp2.daos.*;
import es.upm.miw.apaw.ecp2.daos.AgenteDao;

public class DaoFactoryMemory extends DaoFactory {

        private ArtistaDao artistaDao;

        private AgenteDao agenteDao;

        private ConciertoDao conciertoDao;

        private AlbumsDao albumsDao;

        @Override
        public ArtistaDao getArtistaDao() {
            if (this.artistaDao == null) {
                this.artistaDao = new ArtistaDaoMemory();
            }
            return this.artistaDao;
        }

        @Override
        public ConciertoDao getConciertoDao() {
            if (this.conciertoDao == null) {
                this.conciertoDao = new ConciertoDaoMemory();
            }
            return this.conciertoDao;
        }

        @Override
        public AgenteDao getAgenteDao() {
            if (this.agenteDao == null) {
                this.agenteDao = new AgenteDaoMemory();
            }
            return this.agenteDao;
        }

        public AlbumsDao getAlbumsDao(){
            if (this.albumsDao == null) {
                this.albumsDao = new AlbumsDaoMemory();
            }
            return this.albumsDao;
        }
    }


