package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.Matricula;

public interface MatriculaDao {

  boolean insertarMatricula(Matricula matricula);

  public List<Matricula> obtenerMatriculaAlumno(int codigo);
}
