package es.upm.miw.apaw.ecp2.daos.memory;

import es.upm.miw.apaw.ecp2.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.daos.ConciertoDao;
import es.upm.miw.apaw.ecp2.daos.ArtistaDao;
import es.upm.miw.apaw.ecp2.daos.AgenteDao;
public class DaoFactoryMemory {




public class DaoMemoryFactory extends DaoFactory {

    private ArtistaDao artistaDao;

    private AgenteDao agenteDao;

    private ConciertoDao conciertoDao;

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
    public AgenteDao AgenteDao() {
        if (this.AgenteDao == null) {
            this.AgenteDao = new AgenteDaoMemory();
        }
        return this.AgenteDao;
    }
}

