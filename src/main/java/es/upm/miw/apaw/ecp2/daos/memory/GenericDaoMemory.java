package es.upm.miw.apaw.ecp2.daos.memory;

import es.upm.miw.apaw.ecp2.daos.*;
import org.apache.logging.log4j.LogManager;

import java.util.*;

public abstract class GenericDaoMemory<T> implements GenericDao<T> {

    protected Map<Integer, T> map;

    private int id;

    GenericDaoMemory() {
        this.map = new HashMap<>();
        this.id = 1;
    }

    @Override
    public void save(T entity) {
        int id = this.getId(entity);

        this.map.put(id, entity);
        LogManager.getLogger(this.getClass()).debug("   save: " + entity);
    }
/*
    @Override
    public Optional<T> read(String id) {
        T entity = map.get(id);
        LogManager.getLogger(this.getClass()).debug("   read(" + id + "): " + entity);
        return Optional.ofNullable(entity);
    }
*/
    @Override
    public void deleteById(int id) {
        LogManager.getLogger(this.getClass()).debug("   deleteById(" + id + "): " + map.remove(id));
    }
/*
    @Override
    public List<T> findAll() {
        ArrayList<T> list = new ArrayList<>(map.values());
        LogManager.getLogger(this.getClass()).debug("   findAll: " + list);
        return list;
    }
*/
    public abstract int getId(T entity);

    public abstract void setId(T entity, int id);

}
