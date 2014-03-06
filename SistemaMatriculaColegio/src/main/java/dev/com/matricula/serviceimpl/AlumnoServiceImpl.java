package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.daoimpl.AlumnoDaoImpl;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.AlumnoService;

public class AlumnoServiceImpl implements AlumnoService {

  private AlumnoDao alumnoDao;

  @Override
  public boolean registrarAlumno(Alumno alumno) {
    alumnoDao = new AlumnoDaoImpl();
    return alumnoDao.registrarAlumno(alumno);
  }

}
