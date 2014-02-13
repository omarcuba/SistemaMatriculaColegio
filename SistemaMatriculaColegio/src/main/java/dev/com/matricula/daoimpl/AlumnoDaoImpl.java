package dev.com.matricula.daoimpl;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.daobase.AbstractHibernateBaseDao;
import dev.com.matricula.model.Alumno;

public class AlumnoDaoImpl extends AbstractHibernateBaseDao<Alumno> implements AlumnoDao {

  @Override
  public boolean insertarAlumno(Alumno alumno) {
    try {
      super.insertar(alumno);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
