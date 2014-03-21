package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.ConsultaDatoAlumnoService;

public class ConsultaDatoAlumnoServiceImpl implements ConsultaDatoAlumnoService {

  private AlumnoDao alumnoDao;

  @Override
  public Alumno obtenerDatoAlumno(int codigo) {
    return alumnoDao.obtenerDatoAlumno(codigo);
  }

  public void setAlumnoDao(AlumnoDao alumnoDao) {
    this.alumnoDao = alumnoDao;
  }
}
