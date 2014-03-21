package dev.com.matricula.service;

import java.util.List;

import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.UsuarioAlumno;

public interface LoginService {

  public Usuario obtenerDatoUsuarioAcceso(String login, String clave);

  public RolUsuario obtenerDatoUsuarioRol(int idUsuario);

  public List<UsuarioAlumno> obtenerIdAlumno(int codigoUsuario);
}
