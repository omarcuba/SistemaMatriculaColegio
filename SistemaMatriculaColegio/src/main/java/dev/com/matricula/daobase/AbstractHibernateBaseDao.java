package dev.com.matricula.daobase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public abstract class AbstractHibernateBaseDao<E> implements BaseDao<E> {

  private static SessionFactory sessionFactory;

  static {
    try {
      // Crea el SessionFactory conforme al archivo de configuracion
      // (hibernate.cfg.xml).
      sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    } catch (Throwable e) {
      System.err.println("Fallo en la creación inicial de SessionFactory:" + "\n" + e);
      throw new ExceptionInInitializerError(e);
    }
  }

  public AbstractHibernateBaseDao() {
  }

  /* Inicio - Redefiniendo metodos de la interfaz *************************** */

  @Override
  public boolean insertar(E entidad) {
    try {
      getSession().save(entidad);
      return true;
    } catch (final Exception e) {
      return false;
    }
  }

  @Override
  public boolean actualizar(E entidad) {
    try {
      getSession().merge(entidad);
      return true;
    } catch (final Exception e) {
      return false;
    }
  }

  @Override
  public boolean remover(E entidad) {
    try {
      getSession().delete(entidad);
      return true;
    } catch (final Exception e) {
      return false;
    }
  }

  /* Fin - Redefiniendo metodos de la interfaz *************************** */

  public final Session getSession() {
    return sessionFactory.getCurrentSession();
  }

  public SessionFactory getSessionFactory() {
    return sessionFactory;
  }

}
