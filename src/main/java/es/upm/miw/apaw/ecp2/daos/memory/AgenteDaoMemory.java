package es.upm.miw.apaw.ecp2.daos.memory;

import es.upm.miw.apaw.ecp2.daos.AgenteDao;
import es.upm.miw.apaw.ecp2.daos.ArtistaDao;
import es.upm.miw.apaw.ecp2.entities.Agente;
import es.upm.miw.apaw.ecp2.entities.Artista;

import java.util.stream.Collectors;

public class AgenteDaoMemory extends GenericDaoMemory<Agente> implements AgenteDao
{

        @Override
        public int getId(Agente agente) {
            return agente.getId();
        }

        @Override
        public void setId(Agente agente, int id) {
            agente.setId(id);
        }
        @Override
        public void addAgente(Agente agente){

                map.put(agente.getId(), agente);
        }


}
