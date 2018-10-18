package es.upm.miw.apaw.ecp2.businesscontrollers;

import es.upm.miw.apaw.ecp2.daos.AgenteDao;
import es.upm.miw.apaw.ecp2.daos.ArtistaDao;
import es.upm.miw.apaw.ecp2.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.dtos.AgenteDto;
import es.upm.miw.apaw.ecp2.dtos.ArtistaDto;
import es.upm.miw.apaw.ecp2.entities.Agente;
import es.upm.miw.apaw.ecp2.entities.Artista;

public class AgenteBusinessController {

    public Agente convertDtoToAgente(AgenteDao agenteDao, AgenteDto agenteDto) {
        Agente agente = new Agente(2,"Pepe", "Camarao");
        agente.setId(agenteDto.getIdAgente());
        agente.setNombre(agenteDto.getNombre());
        agente.setPseudonimo(agenteDto.getPseudonimo());
        agente.setTelefonoAgente(agenteDto.getTelefonoAgente());
        return agente;
    }


    public void addAgente(int idArtista, AgenteDto agenteDto) {

        AgenteDao agenteDao = DaoFactory.getFactory().getAgenteDao();
        Agente agente = this.convertDtoToAgente(agenteDao, agenteDto);

        ArtistaDao artistaDao = DaoFactory.getFactory().getArtistaDao();
        Artista artista = artistaDao.findArtista(idArtista);
        agenteDao.addAgente(agente);
        artista.setSuAgente(agente);
        artistaDao.setArtista(idArtista, artista);

    }
}


