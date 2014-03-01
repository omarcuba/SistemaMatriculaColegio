package dev.com.matricula.service;

import java.util.List;
import dev.com.matricula.model.Notas;

public interface ConsultaNotasService {

  public List<Notas> obtenerNotasAlumno(int codigo);
}
