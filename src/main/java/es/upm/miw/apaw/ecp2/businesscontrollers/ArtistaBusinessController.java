package es.upm.miw.apaw.ecp2.businesscontrollers;

import es.upm.miw.apaw.ecp2.daos.ArtistaDao;
import es.upm.miw.apaw.ecp2.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.dtos.ArtistaDto;
import es.upm.miw.apaw.ecp2.entities.Artista;

import java.util.List;

public class ArtistaBusinessController {
    private ArtistaDto convertArtistaToDto(ArtistaDao artistaDao, int idArtista){
        ArtistaDto artistaDto = null;
        artistaDto.setIdArtista(artistaDao.findArtista(idArtista).getId());
        artistaDto.setNombre(artistaDao.findArtista(idArtista).getNombre());
        artistaDto.setAnonimo(artistaDao.findArtista(idArtista).getAnonimo());
        artistaDto.setPseudonimo(artistaDao.findArtista(idArtista).getPseudonimo());
        artistaDto.setSuAgente(artistaDao.findArtista(idArtista).getSuAgente());
        artistaDto.setSusAlbumes(artistaDao.findArtista(idArtista).getSusAlbumes());

        return artistaDto;
    }
    public List<ArtistaDto> readAll(){
        List<ArtistaDto> listaArtistas = null;
        ArtistaDto artistaDto = null;
        ArtistaDao artistaDao = DaoFactory.getFactory().getArtistaDao();
        int max = artistaDao.getArtistaLista().size();
        for (int id=0; id<max; id++) {
            convertArtistaToDto(artistaDao, id);
        }
        listaArtistas.add(
            artistaDto
        ); // todos);
        return listaArtistas;
    }
    public ArtistaDto findById (int idArtista){
        ArtistaDto artistaDto = null;
        ArtistaDao artistaDao = DaoFactory.getFactory().getArtistaDao();
        convertArtistaToDto(artistaDao, idArtista);

        return artistaDto;
    }
    public ArtistaDto findByName(String name){
        ArtistaDao artistaDao = DaoFactory.getFactory().getArtistaDao();
        ArtistaDto artistaDto;
        int idBuscar = 0;
        for (Artista artista : artistaDao.getArtistaLista()) {
            if (artista.getNombre() == name);
            idBuscar = artista.getId();
        }
        artistaDto = convertArtistaToDto(artistaDao, idBuscar);
        return artistaDto;
    }

}
