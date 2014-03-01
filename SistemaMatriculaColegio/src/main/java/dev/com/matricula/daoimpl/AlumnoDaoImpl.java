package dev.com.matricula.daoimpl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.model.Alumno;

public class AlumnoDaoImpl extends SessionFactoryImpl implements AlumnoDao {

  String CODIGO = "idAlumno";
  private Alumno alumno;

  @Override
  public boolean insertarAlumno(Alumno alumno) {
    try {
      Session session = getSessionFactory().openSession();
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
  public Alumno obtenerDatoAlumno(int codigo) {
    Session session = getSessionFactory().openSession();
    session.beginTransaction();
    Criteria criteria = session.createCriteria(Alumno.class);
    criteria.add(Restrictions.eq(CODIGO, codigo));
    alumno = (Alumno) criteria.uniqueResult();
    session.close();
    return alumno;
  }
}
