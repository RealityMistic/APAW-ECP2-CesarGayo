import es.upm.miw.apaw.ecp2.apicontrollers.ArtistaApiController;
import es.upm.miw.apaw.ecp2.daos.ArtistaDao;
import es.upm.miw.apaw.ecp2.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.daos.memory.ArtistaDaoMemory;
import es.upm.miw.apaw.ecp2.dtos.ArtistaDto;
import es.upm.miw.apaw.ecp2.entities.Agente;
import es.upm.miw.apaw.ecp2.entities.Artista;
import es.upm.miw.apaw.ecp2.entities.ArtistaBuilder;
import es.upm.miw.apaw.ecp2.http.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import es.upm.miw.apaw.ecp2.http.HttpRequest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GETFindArtistaTest {

    @Test
    void findByIdArtistaTest(){
        String subpath = ArtistaApiController.ARTISTAS + ArtistaApiController.FINDID + "/1";
        HttpRequest request = new HttpRequest().builder(subpath).get();
        HttpException exception = new HttpException(HttpStatus.BAD_REQUEST, "Excepción HTTP Bad");
        HttpResponse response = new Client().submit(request);
        assertEquals(HttpStatus.OK, response.getStatus());
    }
}
