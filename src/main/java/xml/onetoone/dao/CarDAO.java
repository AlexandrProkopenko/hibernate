package xml.onetoone.dao;

import xml.onetoone.entity.Car;

import java.util.List;

public interface CarDAO {

    Long create(Car car);

    Car read(Long id);

    boolean update(Car car);

    boolean delete(Car car);

    List<Car> getAll();
}
