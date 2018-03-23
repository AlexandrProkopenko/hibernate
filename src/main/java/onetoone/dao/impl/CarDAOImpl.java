package onetoone.dao.impl;

import onetoone.dao.CarDAO;
import onetoone.entity.Car;
import onetoone.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CarDAOImpl implements CarDAO {

    private SessionFactory factory;

    public CarDAOImpl(){
        factory = HibernateUtil.getFactory();
    }

    public Long create(Car car) {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            Long id = (Long)session.save(car);
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

    public Car read(Long id) {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            Car car = session.get(Car.class, id);
            session.getTransaction().commit();
            return car;
        }catch (HibernateException e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return null;
    }

    public boolean update(Car car) {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.update(car);
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

    public boolean delete(Car car) {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.delete(car);
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

    public List<Car> getAll() {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            List<Car> cars = session.createCriteria(Car.class).list();
            return cars;
        }catch (HibernateException e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return null;
    }
}
