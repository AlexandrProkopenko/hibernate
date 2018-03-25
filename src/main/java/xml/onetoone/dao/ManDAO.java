package xml.onetoone.dao;

import xml.onetoone.entity.Man;

import java.util.List;

public interface ManDAO {

    Long create(Man man);

    Man read(Long id);

    boolean update(Man man);

    boolean delete(Man man);

    List<Man> getAll();
}
