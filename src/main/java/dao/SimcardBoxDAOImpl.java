package dao;

import entity.SimcardBox;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import java.util.List;

public class SimcardBoxDAOImpl implements SimcardBoxDAO {

    private static SessionFactory factory;

    public SimcardBoxDAOImpl(){
        factory = HibernateUtil.getFactory();
    }

    public Integer create(SimcardBox simcardBox) {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            Integer id = (Integer) session.save(simcardBox);
            session.getTransaction().commit();
            return id;
        }catch (HibernateException e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }

        return null;
    }

    public SimcardBox read(Integer id) {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            SimcardBox simcardBox;
            simcardBox = session.get(SimcardBox.class, id);
            return simcardBox;
        }catch (HibernateException e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }

        return null;
    }

    public boolean update(SimcardBox simcardBox) {
        return false;
    }

    public boolean delete(SimcardBox simcardBox) {
        return false;
    }

    public List<SimcardBox> getAll() {
        return null;
    }
}
