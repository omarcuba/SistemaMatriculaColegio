package dev.com.matricula.serviceimpl;

import java.util.List;

import dev.com.matricula.dao.MatriculaDao;
import dev.com.matricula.daoimpl.MatriculaDaoImpl;
import dev.com.matricula.model.Matricula;
import dev.com.matricula.service.ConsultaAlumnosService;

public class ConsultaAlumnosServiceImpl implements ConsultaAlumnosService {

  private MatriculaDao matriculaDao;

  @Override
  public List<Matricula> obtenerMatriculaAlumno(int codigo) {
    matriculaDao = new MatriculaDaoImpl();
    return matriculaDao.obtenerMatriculaAlumno(codigo);
  }

}
