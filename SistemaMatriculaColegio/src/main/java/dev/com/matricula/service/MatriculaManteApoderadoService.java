package dev.com.matricula.service;

import dev.com.matricula.model.Apoderado;
import dev.com.matricula.model.Rolusuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.Usuarioalumno;

public interface MatriculaManteApoderadoService {

  public Integer buscarUltimoidApoderado();

  public Integer buscarUltimoidUsuario();

  public Integer buscarUltimoidRolUsuario();

  public Integer buscarUltimoidUsuarioAlumno();

  boolean registrarApoderado(Apoderado apoderado);

  boolean registrarUsuario(Usuario usuario);

  boolean registrarRolUsuario(Rolusuario rolUsuario);

  boolean registrarUsuarioAlumno(Usuarioalumno usuarioAlumno);

}
