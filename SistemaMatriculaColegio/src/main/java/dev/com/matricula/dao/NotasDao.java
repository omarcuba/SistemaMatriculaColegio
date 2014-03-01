package dev.com.matricula.dao;

import java.util.List;
import dev.com.matricula.model.Notas;

public interface NotasDao {

  boolean insertarNotas(Notas notas);

  public List<Notas> obtenerNotasAlumno(int codigo);
}
