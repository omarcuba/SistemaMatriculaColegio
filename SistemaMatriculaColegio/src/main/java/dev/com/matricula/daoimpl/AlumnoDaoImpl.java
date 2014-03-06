package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.model.Alumno;

public class AlumnoDaoImpl extends SessionFactoryImpl implements AlumnoDao {

  private Session session;
  private Criteria criteria;
  private Query query;
  private int entero;
  private String CODIGO_ALUMNO = "idAlumno";
  private Alumno alumno;
  private List<Alumno> alumnoList;

  @Override
  public boolean registrarUsuario(Alumno alumno) {
    try {
      session = getSessionFactory().openSession();
      session.beginTransaction();
      session.saveOrUpdate(alumno);
      session.getTransaction().commit();
      session.close();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public Integer obtenerUltimoIdAlumno() {
    session = getSessionFactory().openSession();
    query = session.createSQLQuery("select max(idalumno+1) from Alumno");
    entero = Integer.parseInt(query.uniqueResult().toString());
    return entero;
  }

  @Override
  public Alumno obtenerDatoAlumno(int codigoAlumno) {
    session = getSessionFactory().openSession();
    session.beginTransaction();
    criteria = session.createCriteria(Alumno.class);
    criteria.add(Restrictions.eq(CODIGO_ALUMNO, codigoAlumno));
    alumno = (Alumno) criteria.uniqueResult();
    session.close();
    return alumno;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Alumno> obtenerAlumnos() {
    session = getSessionFactory().openSession();
    criteria = session.createCriteria(Alumno.class);
    alumnoList = criteria.list();
    session.close();
    return alumnoList;
  }
}
