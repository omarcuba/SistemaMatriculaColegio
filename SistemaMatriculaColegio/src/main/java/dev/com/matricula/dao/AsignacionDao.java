package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.Asignacion;

public interface AsignacionDao {

  boolean insertarAsignacion(Asignacion asignacion);

  public List<Asignacion> obtenerAsignacionAlumno(int codigo);
}
