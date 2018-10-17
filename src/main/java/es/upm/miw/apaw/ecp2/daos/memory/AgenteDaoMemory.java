package es.upm.miw.apaw.ecp2.daos.memory;

import java.util.stream.Collectors;

public class AgenteDaoMemoryextends GenericDaoMemory<Theme> implements AgenteDao
{

        @Override
        public String getId(Agente agente) {
            return agente.getId();
        }

        @Override
        public void setId(Agente agente, String id) {
            theme.setId(id);
        }

    }
}
