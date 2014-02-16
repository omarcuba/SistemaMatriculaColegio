package dev.com.matricula.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public abstract class SessionFactoryImpl {

  private static SessionFactory sessionFactory;

  static {
    try {
      sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    } catch (Throwable e) {
      System.err.println("Fallo en la creacion inicial de SessionFactory:" + "\n" + e);
      throw new ExceptionInInitializerError(e);
    }
  }

  public SessionFactoryImpl() {

  }

  public final Session getSession() {
    return sessionFactory.getCurrentSession();
  }

  public SessionFactory getSessionFactory() {
    return sessionFactory;
  }

  public static void setSessionFactory(SessionFactory sessionFactory) {
    SessionFactoryImpl.sessionFactory = sessionFactory;
  }

}
