package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.AsignacionDao;
import dev.com.matricula.model.Asignacion;

public class AsignacionDaoImpl extends SessionFactoryImpl implements AsignacionDao {

  String CODIGO_ANHOESCOLAR = "anhoescolar.idAnhoEscolar";
  private List<Asignacion> asignacionList;

  @Override
  public boolean insertarAsignacion(Asignacion asignacion) {
    try {
      Session session = getSessionFactory().openSession();
      session.beginTransaction();
      session.saveOrUpdate(asignacion);
      session.getTransaction().commit();
      session.close();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Asignacion> obtenerAsignacionAlumno(int codigo) {
    Session session = getSessionFactory().openSession();
    Criteria criteria = session.createCriteria(Asignacion.class);
    criteria.add(Restrictions.eq(CODIGO_ANHOESCOLAR, "2013"));
    asignacionList = criteria.list();
    session.close();
    return asignacionList;
  }
}
