package xml.manytomany.dao;

import java.util.List;

public interface EntityDAO <T> {

    Long add(T entity);

    T getById(Long id);

    boolean update(T entity);

    boolean remove(T entity);

    List<T> getAll();
}
