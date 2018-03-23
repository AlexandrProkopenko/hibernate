package onetoone;

import onetoone.dao.impl.CarDAOImpl;
import onetoone.dao.impl.ManDAOImpl;
import onetoone.entity.Car;
import onetoone.entity.Man;

public class OnoToOneApp {

    public static void main(String[] args) {
        ManDAOImpl manDAO = new ManDAOImpl();
        CarDAOImpl carDAO = new CarDAOImpl();

        Man man1 = new Man("Vasya",25, null);
        Man man2 = new Man("Petya",5, null);

        Car car1 = new Car("Sens", "Er33r", null);
        Car car2 = new Car("ZAZ", "ww4567rf", null);

        man1.setCar(car1);
        man2.setCar(car2);

        man1 = manDAO.read(1L);
        System.out.println(man1);
        man2 = manDAO.read(2L);
        System.out.println(man2);
//        manDAO.create(man1);
    }
}
