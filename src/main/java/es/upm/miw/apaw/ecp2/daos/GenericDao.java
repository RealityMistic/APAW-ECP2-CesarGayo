package es.upm.miw.apaw.ecp2.daos;


import java.util.List;
import java.util.Optional;


public interface GenericDao<T> {

    void save(T entity);

 //   Optional<T> read(ID id);

    void deleteById(int id);

}
