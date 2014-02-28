package dev.com.matricula.serviceimpl;

import java.util.List;
import dev.com.matricula.dao.NotasDao;
import dev.com.matricula.daoimpl.NotasDaoImpl;
import dev.com.matricula.model.Notas;
import dev.com.matricula.service.ConsultaNotasService;

public class ConsultaNotasServiceImpl implements ConsultaNotasService {

  private NotasDao notasDao;

  @Override
  public List<Notas> obtenerNotasAlumno(String codigo) {
    notasDao = new NotasDaoImpl();
    return notasDao.obtenerNotasAlumno(codigo);
  }

}
