package dev.com.matricula.dao;

import dev.com.matricula.model.RolUsuario;

public interface RolUsuarioDao {

  public boolean insertarRolUsuario(RolUsuario rolUsuario);

  public String obtenerUltimoIdRolUsuario();

  public RolUsuario obtenerDatoRolUsuario(String codUsuario);

}
