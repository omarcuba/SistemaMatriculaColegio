package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.daoimpl.AlumnoDaoImpl;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.ConsultaDatoAlumnoService;

public class ConsultaDatoAlumnoServiceImpl implements ConsultaDatoAlumnoService {

  private AlumnoDao alumnoDao;

  @Override
  public Alumno obtenerDatoAlumno(int codigo) {
    alumnoDao = new AlumnoDaoImpl();
    return alumnoDao.obtenerDatoAlumno(codigo);
  }

}
