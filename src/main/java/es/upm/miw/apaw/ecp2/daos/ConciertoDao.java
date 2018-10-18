package es.upm.miw.apaw.ecp2.daos;
import es.upm.miw.apaw.ecp2.entities.Concierto;
public interface ConciertoDao extends GenericDao<Concierto> {
    public void addConcierto(Concierto concierto);
    public int getId(Concierto concierto);
    public void setId(Concierto concierto, int id);

}
