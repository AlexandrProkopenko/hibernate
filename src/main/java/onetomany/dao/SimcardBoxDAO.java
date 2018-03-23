package onetomany.dao;


import onetomany.entity.SimcardBox;

import java.util.List;

public interface SimcardBoxDAO {

    Integer create(SimcardBox simcardBox);

    SimcardBox read(Integer id);

    boolean update(SimcardBox simcardBox);

    boolean delete(SimcardBox simcardBox);

    List<SimcardBox> getAll();
}
