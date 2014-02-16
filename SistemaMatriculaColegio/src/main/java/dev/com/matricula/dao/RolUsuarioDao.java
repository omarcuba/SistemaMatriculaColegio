package dev.com.matricula.dao;

import dev.com.matricula.model.RolUsuario;

public interface RolUsuarioDao {

  public boolean registrarRolUsuario(RolUsuario rolUsuario);

  public Integer obtenerUltimoIdRolUsuario();

  public RolUsuario obtenerDatoRolUsuario(String codUsuario);

}
