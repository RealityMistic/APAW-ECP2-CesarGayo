package es.upm.miw.apaw.ecp2.entities;

public class Agente extends Profesional{
    int idAgente;
    String telefonoAgente;

    public Agente(int idAgente, String nombreAgente, String telefonoAgente) {
        this.idAgente = idAgente;
        this.nombre = nombreAgente;
        this.telefonoAgente = telefonoAgente;
    }
}
