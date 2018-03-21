package dao;

import entity.Simcard;

import java.util.List;

public interface SimcardDAO {

    Integer create(Simcard simcard);

    Simcard read(Integer id);

    boolean update(Simcard simcard);

    boolean delete(Simcard simcard);

    List<Simcard> getAll();
}
