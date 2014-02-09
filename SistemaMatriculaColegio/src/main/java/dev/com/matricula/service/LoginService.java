package dev.com.matricula.service;

import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;

public interface LoginService {

  public Usuario obtenerDatoUsuarioAcceso(String login, String clave);

  public RolUsuario obtenerDatoUsuarioRol(String idUsuario);
}
