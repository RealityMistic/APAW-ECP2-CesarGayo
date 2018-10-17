package es.upm.miw.apaw.ecp2.apicontrollers;

import es.upm.miw.apaw.ecp2.businesscontrollers.ArtistaBusinessController;
import es.upm.miw.apaw.ecp2.dtos.ConciertoDto;
import es.upm.miw.apaw.ecp2.entities.Artista;

public class ArtistaApiController {
    public static final String ARTISTAS = "/artistas";
    public static final String NOMBRE =  "/artistas/nombre";

    private ArtistaBusinessController artistaBusinessController = new ArtistaBusinessController();

    public List<ArtistListDto> readAll(){
    }

    public void findById(int artistaId){
        return this.ArtistaBusinessController.findById(artistaId);

    }

    public void findByName(Artista artistaDto){
        this.validate(artistaDto, "artistaDto");
        this.validate(artistaDto.getNombre(), "ArtistaDto nombre");
        this.artistaBusinessController.findByName(artistaDto);


    }

    private void validate(Object property, String message) {
        if (property == null) {
            throw new ArgumentNotValidException(message + " no está presente");
        }
    }
}
