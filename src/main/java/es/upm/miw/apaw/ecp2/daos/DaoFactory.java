package es.upm.miw.apaw.ecp2.daos;

import org.apache.logging.log4j.LogManager;

public abstract class DaoFactory {

    private static DaoFactory factory = null;

    public static DaoFactory getFactory() {
        assert factory != null;
        return factory;
    }

    public static void setFactory(DaoFactory factory) {
        DaoFactory.factory = factory;

    }

    public abstract ArtistaDao getArtistaDao();


    public abstract ConciertoDao getConciertoDao();

    public abstract AgenteDao getAgenteDao();

    public abstract AlbumsDao getAlbumsDao();
}
