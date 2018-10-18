import es.upm.miw.apaw.ecp2.apicontrollers.AgenteApiController;
import es.upm.miw.apaw.ecp2.apicontrollers.ArtistaApiController;
import es.upm.miw.apaw.ecp2.dtos.AgenteDto;
import es.upm.miw.apaw.ecp2.http.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class POSTTest {

    @Test
    void addAgenteTest(){
        AgenteDto agenteDto = new AgenteDto(2, "Juan", "Johny Walker", "1313");
        String subpath = AgenteApiController.AGENTE ;
        HttpRequest request = new HttpRequest().
                                    builder(subpath).
                                    body(agenteDto).
                                    post();
        HttpException exception = new HttpException(HttpStatus.BAD_REQUEST, "Excepción HTTP Bad");
        HttpResponse response = new Client().submit(request);
        assertEquals(HttpStatus.OK, response.getStatus());
    }
}
