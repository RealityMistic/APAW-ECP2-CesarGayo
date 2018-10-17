package es.upm.miw.apaw.ecp2.daos.memory;

import es.upm.miw.apaw.ecp2.daos.AgenteDao;
import es.upm.miw.apaw.ecp2.entities.Agente;

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

        public void addAgente(Agente agente){
                agente.setId(agente.getId());
                agente.setNombre(agente.getNombre());
                agente.setPseudonimo(agente.getPseudonimo());
                agente.setTelefonoAgente(agente.getTelefonoAgente());
        }


}
