package es.upm.miw.apaw.ecp2.daos;

import es.upm.miw.apaw.ecp2.dtos.AgenteDto;
import es.upm.miw.apaw.ecp2.entities.Agente;
import es.upm.miw.apaw.ecp2.entities.Concierto;

 public interface AgenteDao extends GenericDao<Agente> {

      public void addAgente(Agente agente);

}
