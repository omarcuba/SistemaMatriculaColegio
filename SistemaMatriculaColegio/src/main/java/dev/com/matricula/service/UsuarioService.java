package dev.com.matricula.service;

import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;

public interface UsuarioService {

  public boolean registrarUsuario(Usuario usuario);

  public boolean registrarAccesoRol(RolUsuario rolUsuario);

  public String BuscarUltimoidRolUsuario();

  public String BuscarUltimoidUsuario();

}
