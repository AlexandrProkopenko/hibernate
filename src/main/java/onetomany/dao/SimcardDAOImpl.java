package onetomany.dao;

import onetomany.entity.Simcard;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import onetomany.util.HibernateUtil;

import java.util.List;

public class SimcardDAOImpl implements SimcardDAO {

    private SessionFactory factory;

    public SimcardDAOImpl(){
        factory = HibernateUtil.getFactory();
    }

    public Integer create(Simcard simcard) {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            Integer id =  (Integer) session.save(simcard);
            session.getTransaction().commit();
            return id;
        } catch (HibernateException exc) {
            exc.printStackTrace();
            session.getTransaction().rollback();

        } finally {
            session.close();
        }
        return null;
    }

    public Simcard read(Integer id) {
        Session session = factory.openSession();
//        List<Simcard> list;
        Simcard res = null;
        try {
            session.beginTransaction();
            res = session.get(Simcard.class, id);
//            Query query = session.createQuery("FROM Simcard  WHERE id = :id");
//            query.setParameter("id", id);
//            list = query.list();
//            res = list.get(0);
        }catch (HibernateException e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }catch (NullPointerException e){
         e.printStackTrace();
        }
        finally {
            session.close();
        }
        return res;
    }

    public boolean update(Simcard simcard) {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.update(simcard);

            session.getTransaction().commit();
            return true;
        }catch (HibernateException e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return false;
    }

    public boolean delete(Simcard simcard) {

        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.delete(simcard);
            session.getTransaction().commit();

        }catch (HibernateException e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return false;
    }

    public List<Simcard> getAll() {
        Session session = factory.openSession();
        List<Simcard> list = null;
        try{

            list = session.createCriteria(Simcard.class).list();
//           list = session.createQuery("FROM Simcard").list();

        }catch(HibernateException e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }

        return list;
    }

    public List<Simcard> getByOperator(String op){
        Session session = factory.openSession();
        List<Simcard> list = null;
        try{

            Criteria criteria = session.createCriteria(Simcard.class);
            criteria.add(Restrictions.eq("operator", op));

        }catch(HibernateException e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }

        return list;
    }
}
