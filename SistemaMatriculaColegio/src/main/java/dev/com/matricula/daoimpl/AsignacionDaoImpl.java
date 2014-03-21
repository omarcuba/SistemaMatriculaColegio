package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.AsignacionDao;
import dev.com.matricula.model.Asignacion;

public class AsignacionDaoImpl extends AbstractHibernateDao implements AsignacionDao {

  private Session session;
  private Criteria criteria;
  private Query query;
  private int entero;
  private String CODIGO_ANHOESCOLAR = "anhoEscolar.idAnhoEscolar";
  private List<Asignacion> asignacionList;

  @Override
  public boolean registrarAsignacion(Asignacion asignacion) {
    try {
      session = getSessionFactory().openSession();
      session.beginTransaction();
      session.saveOrUpdate(asignacion);
      session.getTransaction().commit();
      session.close();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public Integer obtenerUltimoIdAsignacion() {
    session = getSessionFactory().openSession();
    query = session.createSQLQuery("select max(idasignacion+1) from Asignacion");
    entero = Integer.parseInt(query.uniqueResult().toString());
    session.close();
    return entero;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Asignacion> obtenerAsignaciones() {
    session = getSessionFactory().openSession();
    criteria = session.createCriteria(Asignacion.class);
    asignacionList = criteria.list();
    session.close();
    return asignacionList;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Asignacion> obtenerAsignacionAlumno(int codigoAnhoEscolar) {
    session = getSessionFactory().openSession();
    criteria = session.createCriteria(Asignacion.class);
    criteria.add(Restrictions.eq(CODIGO_ANHOESCOLAR, "2013"));
    asignacionList = criteria.list();
    // session.close();
    return asignacionList;
  }

}
