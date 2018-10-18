package es.upm.miw.apaw.ecp2.daos.memory;

import es.upm.miw.apaw.ecp2.daos.*;
import es.upm.miw.apaw.ecp2.entities.Concierto;

public class ConciertoDaoMemory extends GenericDaoMemory<Concierto> implements ConciertoDao {

    @Override
    public void addConcierto(Concierto concierto) {

    }

    @Override
    public int getId(Concierto concierto) {
        return concierto.getId();
    }

    @Override
    public void setId(Concierto concierto, int id) {

    }

}
