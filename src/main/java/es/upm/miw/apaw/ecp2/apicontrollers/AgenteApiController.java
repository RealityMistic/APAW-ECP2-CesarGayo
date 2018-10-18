package es.upm.miw.apaw.ecp2.apicontrollers;

import es.upm.miw.apaw.ecp2.businesscontrollers.AgenteBusinessController;
import es.upm.miw.apaw.ecp2.daos.AgenteDao;
import es.upm.miw.apaw.ecp2.dtos.AgenteDto;
import es.upm.miw.apaw.ecp2.exceptions.ArgumentNotValidException;

public class AgenteApiController {
    public static final String AGENTE = "/agente";
    private AgenteBusinessController agenteBusinessController = new AgenteBusinessController();


    public void addAgente(AgenteDto agenteDto, int idArtista){
         this.validate(agenteDto, " Objeto Agente ");
         this.agenteBusinessController.addAgente(idArtista, agenteDto);
    }

    private void validate(Object property, String message) {
        if (property == null) {
            throw new ArgumentNotValidException(message + " no está presente");
        }
    }
}
