package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.Usuarioalumno;

public interface UsuarioAlumnoDao {

  public List<Usuarioalumno> obtenerIdAlumno(int codigo);

}
