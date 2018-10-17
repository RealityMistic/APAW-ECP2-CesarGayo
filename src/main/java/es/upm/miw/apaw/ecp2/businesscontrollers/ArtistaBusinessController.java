package es.upm.miw.apaw.ecp2.businesscontrollers;

import es.upm.miw.apaw.ecp2.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.dtos.ArtistaDto;

import java.util.List;

public class ArtistaBusinessController {

    public List<ArtistaDto> readAll(){
        List<ArtistaDto> listaArtistas = DaoFactory.getFactory().getArtistaDao() // todos);
        return listaArtistas;
    }
    public void findById (int idArtista){
        ArtistaDto artistaDto;
        return artistaDto = DaoFactory.getFactory().getArtistaDao(idArtista):
    }
    public void findByName(ArtistaDto artistaDto){

    }

}
