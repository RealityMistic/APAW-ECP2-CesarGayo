package es.upm.miw.apaw.ecp2.businesscontrollers;

import es.upm.miw.apaw.ecp2.entities.Concierto;
import es.upm.miw.apaw.ecp2.dtos.ConciertoDto;

public class ConciertosBusinessController {

    public void create(ConciertoDto conciertoDto) {
        Concierto concierto = new Concierto(conciertoDto.getFecha(), conciertoDto.getNombre(), conciertoDto.getPrecio());
        DaoFactory.getFactory().getConciertoDao().save(concierto);
    }
}
