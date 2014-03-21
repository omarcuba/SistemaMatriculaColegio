package dev.com.matricula.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractHibernateDao {

  private SessionFactory sessionFactory;

  public final Session getSession() {
    return sessionFactory.getCurrentSession();
  }

  public SessionFactory getSessionFactory() {
    return sessionFactory;
  }

  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

}
