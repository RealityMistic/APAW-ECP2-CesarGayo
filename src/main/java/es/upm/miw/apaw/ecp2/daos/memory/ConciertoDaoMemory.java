package es.upm.miw.apaw.ecp2.daos.memory;

import es.upm.miw.apaw.ecp2.daos.*;
import es.upm.miw.apaw.ecp2.entities.Concierto;

public class ConciertoDaoMemory extends GenericDaoMemory<Concierto> implements ConciertoDao {

    @Override
    public String getId(Concierto concierto) {
        return concierto.getId();
    }

    @Override
    public void setId(Concierto concierto, String id) {
        concierto.setId(id);
    }
}
