package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.Usuarioalumno;

public interface UsuarioAlumnoDao {

  public boolean registrarUsuario(Usuarioalumno usuarioAlumno);

  public Integer obtenerUltimoIdUsuarioAlumno();

  public List<Usuarioalumno> obtenerUsuarioAlumnos();

  public List<Usuarioalumno> obtenerIdAlumno(int codigoUsuario);

}
