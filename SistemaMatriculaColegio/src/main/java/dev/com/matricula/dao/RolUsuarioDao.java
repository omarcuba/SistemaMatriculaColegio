package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.Rolusuario;

public interface RolUsuarioDao {

  public boolean registrarRolUsuario(Rolusuario rolUsuario);

  public Integer obtenerUltimoIdRolUsuario();

  public Rolusuario obtenerDatoRolUsuario(int codigoUsuario);

  public List<Rolusuario> obtenerRolusuarios();

}
