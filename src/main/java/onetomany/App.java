package onetomany;

import onetomany.dao.SimcardBoxDAOImpl;
import onetomany.dao.SimcardDAOImpl;
import onetomany.entity.Simcard;
import onetomany.entity.SimcardBox;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;


public class App {

    private static SessionFactory factory;

    public static void main(String[] args) {

        SimcardDAOImpl simcardDAO = new SimcardDAOImpl();
        SimcardBoxDAOImpl simcardBoxDAO = new SimcardBoxDAOImpl();





//
        List<Simcard> simcardsList1 = new ArrayList<Simcard>();
//        simcardsList1.add(simcardDAO.read(1));
//        simcardsList1.add(simcardDAO.read(2));
//        simcardsList1.add(simcardDAO.read(3));

//        SimcardBox box1 = new SimcardBox("BoxMTS", 100, simcardsList1);
//        SimcardBox box2 = new SimcardBox("BoxLife", 100, simcardsList1);
//
//
//        simcardBoxDAO.create(box1);
//        simcardBoxDAO.create(box2);

//        simcardDAO.create(sim1);
//        simcardDAO.create(sim2);
//        simcardDAO.create(sim3);
//        simcardDAO.create(sim3);
//        simcardDAO.create(sim3);

//        System.out.println(simcardDAO.read(1));
//        System.out.println(simcardDAO.read(2));
//        System.out.println(simcardDAO.read(3));
//        System.out.println(simcardDAO.read(4));
//        System.out.println(simcardDAO.read(5));
//        System.out.println(simcardDAO.read(6));

//        List<Simcard> simcards = simcardDAO.getAll();
//        for (Simcard sim: simcards){
//            System.out.println(sim);
//        }
//
//        sim1 = simcardDAO.read(1);
//        sim1.setOperator("123");
////        simcardDAO.update(simcardDAO.read(2));
////        simcardDAO.delete(simcardDAO.read(3));
////        simcardDAO.delete(simcardDAO.read(4));
////        simcardDAO.delete(simcardDAO.read(2));
//        System.out.println();
//
//       simcards = simcardDAO.getAll();
//        for (Simcard sim: simcards){
//            System.out.println(sim);
//        }
        SimcardBox simBox1;
        SimcardBox simBox2;
        simBox1 = simcardBoxDAO.read(1);
        simBox2 = simcardBoxDAO.read(2);

        System.out.println(simBox1);
        System.out.println(simBox2);



//        Simcard sim1 = new Simcard("mts", 380397452, 100.0, simBox1);
//        Simcard sim2 = new Simcard("mts", 380335452, 100.0, simBox2);
//        Simcard sim3 = new Simcard("mts", 380999452, 100.0, simBox1);
//        Simcard sim4 = new Simcard("mts", 380225452, 100.0, simBox2);
//        Simcard sim5 = new Simcard("mts", 389995952, 100.0, simBox1);
//
//        simcardDAO.create(sim1);
//        simcardDAO.create(sim2);
//        simcardDAO.create(sim3);
//        simcardDAO.create(sim4);
//        simcardDAO.create(sim5);

    }
}
