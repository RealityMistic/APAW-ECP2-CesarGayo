import es.upm.miw.apaw.ecp2.apicontrollers.CrearConciertoApiController;
import es.upm.miw.apaw.ecp2.dtos.ConciertoDto;
import es.upm.miw.apaw.ecp2.entities.Concierto;
import es.upm.miw.apaw.ecp2.http.Client;
import es.upm.miw.apaw.ecp2.http.HttpException;
import es.upm.miw.apaw.ecp2.http.HttpRequest;
import es.upm.miw.apaw.ecp2.http.HttpStatus;
import org.junit.jupiter.api.Test;

import java.time.*;

public class PUTCrearConciertoTest {

    @Test
    void testCreateConcierto() {
        LocalDateTime fechaConcierto;
        fechaConcierto = LocalDateTime.now();
        ConciertoDto nuevoConciertoDto =  new ConciertoDto(
                                        1,
                                            fechaConcierto,
                                            "TechnoKom",
                                            80,
                                        90

        );
        HttpRequest request = HttpRequest.
                                builder("").path(CrearConciertoApiController.CONCIERTOS)
                                .body(nuevoConciertoDto).put();

        new Client().submit(request);
    }
}
