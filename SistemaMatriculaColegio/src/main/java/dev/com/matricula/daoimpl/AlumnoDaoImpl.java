package dev.com.matricula.daoimpl;

import org.hibernate.Session;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.model.Alumno;

public class AlumnoDaoImpl extends SessionFactoryImpl implements AlumnoDao {

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
}
