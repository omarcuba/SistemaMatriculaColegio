package dev.com.matricula.serviceimpl;

import java.util.List;

import dev.com.matricula.dao.AsignacionDao;
import dev.com.matricula.daoimpl.AsignacionDaoImpl;
import dev.com.matricula.model.Asignacion;
import dev.com.matricula.service.ConsultaCursosService;

public class ConsultaCursosServiceImpl implements ConsultaCursosService {

  private AsignacionDao asignacionDao;

  @Override
  public List<Asignacion> obtenerCursosAlumno(int codigo) {
    asignacionDao = new AsignacionDaoImpl();
    return asignacionDao.obtenerAsignacionAlumno(codigo);
  }

}
