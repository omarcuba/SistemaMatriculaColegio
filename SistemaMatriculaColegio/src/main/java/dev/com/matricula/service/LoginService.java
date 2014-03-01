package dev.com.matricula.service;

import java.util.List;

import dev.com.matricula.model.Rolusuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.Usuarioalumno;

public interface LoginService {

  public Usuario obtenerDatoUsuarioAcceso(String login, String clave);

  public Rolusuario obtenerDatoUsuarioRol(String idUsuario);

  public List<Usuarioalumno> obtenerIdAlumno(int codigo);
}
