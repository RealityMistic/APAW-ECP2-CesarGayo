package es.upm.miw.apaw.ecp2.apicontrollers;


        import es.upm.miw.apaw.ecp2.businesscontrollers.ConciertosBusinessController;
        import es.upm.miw.apaw.ecp2.dtos.ConciertoDto;
        import es.upm.miw.apaw.ecp2.exceptions.ArgumentNotValidException;
        import es.upm.miw.apaw.ecp2.businesscontrollers.ConciertosBusinessController;

public class CrearConciertoApiController {

    public static final String CONCIERTOS = "/conciertos";

    private ConciertosBusinessController conciertoBusinessController = new ConciertosBusinessController();

    public void create(ConciertoDto conciertoDto) {
        this.validate(conciertoDto, "conciertoDto");
        //    this.validate(conciertoDto.getNegative(), "SuggestionDto negative");
        this.validate(conciertoDto.getNombre(), "ConciertoDto nombre");
        this.conciertoBusinessController.create(conciertoDto);
    }

    private void validate(Object property, String message) {
        if (property == null) {
            throw new ArgumentNotValidException(message + " no está presente");
        }
    }
}
