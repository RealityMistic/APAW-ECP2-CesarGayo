package es.upm.miw.apaw.ecp2.apicontrollers;

import es.upm.miw.apaw.ecp2.businesscontrollers.AlbumesArtistaBusinessController;
import es.upm.miw.apaw.ecp2.dtos.AlbumDto;
import es.upm.miw.apaw.ecp2.exceptions.ArgumentNotValidException;

import java.util.List;

public class AlbumesArtistaApiController {
    public static final String ALBUMES = "/albumes";

    public AlbumesArtistaApiController(){

    }

    public void addAlbumes(int idArtista, List<AlbumDto> listaAlbumDto){
        AlbumesArtistaBusinessController albumesArtistaBusinessController = new AlbumesArtistaBusinessController();
        validate(listaAlbumDto, " Objeto lista de Álbumes ");
        albumesArtistaBusinessController.addAlbumes(idArtista, listaAlbumDto);
    }

    private void validate(Object property, String message) {
        if (property == null) {
            throw new ArgumentNotValidException(message + " no está presente");
        }
    }
}
