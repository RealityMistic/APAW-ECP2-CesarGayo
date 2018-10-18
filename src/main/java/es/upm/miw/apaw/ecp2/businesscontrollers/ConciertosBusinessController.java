package es.upm.miw.apaw.ecp2.businesscontrollers;

import es.upm.miw.apaw.ecp2.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.entities.Concierto;
import es.upm.miw.apaw.ecp2.dtos.ConciertoDto;
import es.upm.miw.apaw.ecp2.daos.*;

public class ConciertosBusinessController {

    public void create(ConciertoDto conciertoDto) {
        Concierto concierto = new Concierto(conciertoDto.getId(),
                conciertoDto.getFecha(),
                conciertoDto.getDuracion(),
                conciertoDto.getNombre(),
                conciertoDto.getPrecio());
        DaoFactory.getFactory().getConciertoDao().save(concierto);
    }
}
