package onetoone;

import onetoone.dao.impl.CarDAOImpl;
import onetoone.dao.impl.ManDAOImpl;
import onetoone.entity.Car;
import onetoone.entity.Man;

public class OnoToOneApp {

    public static void main(String[] args) {
        ManDAOImpl manDAO = new ManDAOImpl();
        CarDAOImpl carDAO = new CarDAOImpl();

        Man man1 = null ;
        Man man2 = null ;

        Car car1 = null;
        Car car2 = null;

//        man1 = manDAO.read(1L);
//        System.out.println(man1);
//        man2 = manDAO.read(2L);
//        System.out.println(man2);

        for (int i = 0; i <10; i++) {
            System.out.println(manDAO.read(new  Long(i) ));
        }
//        manDAO.create(man1);
    }
}
