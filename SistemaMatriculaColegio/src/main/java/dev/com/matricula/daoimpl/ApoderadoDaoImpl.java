package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.ApoderadoDao;
import dev.com.matricula.model.Apoderado;

public class ApoderadoDaoImpl extends AbstractHibernateDao implements ApoderadoDao {

  private Session session;
  private Criteria criteria;
  private Query query;
  private int entero;
  private String CODIGO_ALUMNO = "idAlumno";
  private Apoderado apoderado;
  private List<Apoderado> apoderadoList;

  @Override
  public boolean registrarApoderado(Apoderado apoderado) {
    try {
      session = getSessionFactory().openSession();
      session.beginTransaction();
      session.saveOrUpdate(apoderado);
      session.getTransaction().commit();
      session.close();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public Integer obtenerUltimoIdApoderado() {
    session = getSessionFactory().openSession();
    query = session.createSQLQuery("select max(idapoderado+1) from Apoderado");
    entero = Integer.parseInt(query.uniqueResult().toString());
    return entero;
  }

  @Override
  public Apoderado obtenerDatoApoderado(int codigoApoderado) {
    session = getSessionFactory().openSession();
    session.beginTransaction();
    criteria = session.createCriteria(Apoderado.class);
    criteria.add(Restrictions.eq(CODIGO_ALUMNO, codigoApoderado));
    apoderado = (Apoderado) criteria.uniqueResult();
    session.close();
    return apoderado;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Apoderado> obtenerApoderados() {
    session = getSessionFactory().openSession();
    criteria = session.createCriteria(Apoderado.class);
    apoderadoList = criteria.list();
    session.close();
    return apoderadoList;
  }
}
