package xml.manytomany.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import xml.manytomany.dao.EntityDAO;
import xml.manytomany.util.HibernateUtil;

import java.util.List;

public class EntityDAOImpl<T> implements EntityDAO<T>{

    private Class<T> type;
    private SessionFactory factory;

    public EntityDAOImpl(Class<T> type){
        factory = HibernateUtil.getFactory();
        this.type = type;
    }

    public Long add(T entity) {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            Long id = (Long)session.save(entity);
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


    public T getById(Long id) {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            T entity = session.get(type,id);
            session.getTransaction().commit();
            return entity;

        }catch (HibernateException e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return null;
    }

    public boolean update(T entity) {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.update(entity);
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

    public boolean remove(T entity) {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            session.delete(entity);
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

    public List getAll() {
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            List<T> entities = session.createCriteria(type).list();
            return entities;
        }catch (HibernateException e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return null;

    }
}
