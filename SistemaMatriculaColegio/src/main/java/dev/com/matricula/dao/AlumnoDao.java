package dev.com.matricula.dao;

import dev.com.matricula.model.Alumno;

public interface AlumnoDao {

  boolean insertarAlumno(Alumno alumno);

  public Alumno obtenerDatoAlumno(int codigo);
}
