package es.upm.miw.apaw.ecp2.apicontrollers;

import es.upm.miw.apaw.ecp2.businesscontrollers.ArtistaBusinessController;
import es.upm.miw.apaw.ecp2.dtos.ArtistaDto;
import es.upm.miw.apaw.ecp2.dtos.ConciertoDto;
import es.upm.miw.apaw.ecp2.entities.Artista;
import es.upm.miw.apaw.ecp2.exceptions.ArgumentNotValidException;

public class ArtistaApiController {
    public static final String ARTISTAS = "/artistas";
    public static final String NOMBRE =  "/nombre";
    public static final String FINDID = "/findid";

    private ArtistaBusinessController artistaBusinessController = new ArtistaBusinessController();
/*
    public List<ArtistaListDto> readAll(){
    }
*/
    public ArtistaDto findById(int artistaId){
        return this.artistaBusinessController.findById(artistaId);

    }

    public ArtistaDto findByName(String name){
        this.validate(name, "Nombre de artista");
        return this.artistaBusinessController.findByName(name);
    }

    private void validate(Object property, String message) {
        if (property == null) {
            throw new ArgumentNotValidException(message + " no está presente");
        }
    }
}
