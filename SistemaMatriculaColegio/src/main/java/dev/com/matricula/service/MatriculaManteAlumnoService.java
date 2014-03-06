package dev.com.matricula.service;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Rolusuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.Usuarioalumno;

public interface MatriculaManteAlumnoService {

  public Integer buscarUltimoidAlumno();

  public Integer buscarUltimoidUsuario();
  
  public Integer buscarUltimoidRolUsuario();
  
  public Integer buscarUltimoidRolUsuarioAlumno();

  boolean registrarAlumno(Alumno alumno);

  boolean registrarUsuario(Usuario usuario);
  
  boolean registrarRolUsuario(Rolusuario rolUsuario);
  
  boolean registrarUsuarioAlumno(Usuarioalumno usuarioAlumno);

}
