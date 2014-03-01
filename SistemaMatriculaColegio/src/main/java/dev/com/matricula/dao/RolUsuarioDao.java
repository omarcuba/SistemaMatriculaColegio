package dev.com.matricula.dao;

import dev.com.matricula.model.Rolusuario;

public interface RolUsuarioDao {

  public boolean registrarRolUsuario(Rolusuario rolUsuario);

  public Integer obtenerUltimoIdRolUsuario();

  public Rolusuario obtenerDatoRolUsuario(String codUsuario);

}
