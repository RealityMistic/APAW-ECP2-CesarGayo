package es.upm.miw.apaw.ecp2;


import es.upm.miw.apaw.ecp2.apicontrollers.AlbumesArtistaApiController;
import es.upm.miw.apaw.ecp2.apicontrollers.ArtistaApiController;
import es.upm.miw.apaw.ecp2.apicontrollers.CrearConciertoApiController;
import es.upm.miw.apaw.ecp2.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.daos.memory.DaoFactoryMemory;
import es.upm.miw.apaw.ecp2.dtos.ConciertoDto;
import es.upm.miw.apaw.ecp2.exceptions.ArgumentNotValidException;
import es.upm.miw.apaw.ecp2.exceptions.NotFoundException;
import es.upm.miw.apaw.ecp2.exceptions.RequestInvalidException;
import es.upm.miw.apaw.ecp2.http.HttpRequest;
import es.upm.miw.apaw.ecp2.http.HttpStatus;
import es.upm.miw.apaw.ecp2.http.HttpResponse;

import static es.upm.miw.apaw.ecp2.apicontrollers.ArtistaApiController.*;

public class Dispatcher {

    static {
        DaoFactory.setFactory(new DaoFactoryMemory());
    }

    private ArtistaApiController artistaApiController = new ArtistaApiController();

 //   private AgenteApiController agenteApiController = new AgenteApiController();

    private CrearConciertoApiController crearConciertoApiController = new CrearConciertoApiController();

//   private AlbumesArtistaApiController albumesArtistaApiController = new AlbumesArtistaApiController();

    public void submit(HttpRequest request, HttpResponse response) {
        String ERROR_MESSAGE = "{'error':'%S'}";
        try {
            switch (request.getMethod()) {
                case POST:
                  //  this.doPost(request, response);
                    break;
                case GET:
                    this.doGet(request, response);
                    break;
                case PUT:
                    this.doPut(request);
                    break;
                case PATCH:
                    this.doPatch(request);
                    break;
                case DELETE:
                    this.doDelete(request);
                    break;
                default: // Unexpected
                    throw new RequestInvalidException("method error: " + request.getMethod());
            }
        } catch (ArgumentNotValidException | RequestInvalidException exception) {
            response.setBody(String.format(ERROR_MESSAGE, exception.getMessage()));
            response.setStatus(HttpStatus.BAD_REQUEST);
        } catch (NotFoundException exception) {
            response.setBody(String.format(ERROR_MESSAGE, exception.getMessage()));
            response.setStatus(HttpStatus.NOT_FOUND);
        } catch (Exception exception) {  // Unexpected
            exception.printStackTrace();
            response.setBody(String.format(ERROR_MESSAGE, exception));
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    /*
    private void doPost(HttpRequest request, HttpResponse response) {
        if (request.isEqualsPath(AlbumesArtistaApiController.AlbumesArtistaS)) {
            response.setBody(this.AlbumesArtistaApiController.create((AlbumesArtistaDto) request.getBody()));
        } else if (request.isEqualsPath(AgenteApiController.AGENTE)) {
            this.agenteApiController.create((AgenteDto) request.getBody());
        } else {
            throw new RequestInvalidException("request error: " + request.getMethod() + ' ' + request.getPath());
        }
    }
*/
    private void doGet(HttpRequest request, HttpResponse response) {
        if (request.isEqualsPath(ARTISTAS)) {
        //    response.setBody(this.artistaApiController.readAll());
        } else if (request.isEqualsPath(ARTISTAS + FINDID)) {
            response.setBody(this.artistaApiController.
                                    findById(Integer.
                                            parseInt(request.getPath(1))) );
        } else if (request.isEqualsPath(ARTISTAS + NOMBRE)) {
            response.setBody(this.artistaApiController.
                                    findByName(request.getParams().get("name")));
        } else {
            throw new RequestInvalidException("request error: " + request.getMethod() + ' ' + request.getPath());
        }
    }

    private void doPut(HttpRequest request) {
        if (request.isEqualsPath(CrearConciertoApiController.CONCIERTOS )) {
            this.crearConciertoApiController.create(
                      (ConciertoDto) request.getBody());
        } else {
            throw new RequestInvalidException("request error: " + request.getMethod() + ' ' + request.getPath());
        }
    }

    private void doPatch(HttpRequest request) {

    }

    private void doDelete(HttpRequest request) {

    }

}
