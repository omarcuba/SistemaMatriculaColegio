package dev.com.matricula.service;

import dev.com.matricula.model.Rolusuario;
import dev.com.matricula.model.Usuario;

public interface UsuarioService {

  public boolean registrarUsuario(Usuario usuario);

  public boolean registrarAccesoRol(Rolusuario rolUsuario);

  public Integer buscarUltimoidRolUsuario();

  public Integer buscarUltimoidUsuario();

}
