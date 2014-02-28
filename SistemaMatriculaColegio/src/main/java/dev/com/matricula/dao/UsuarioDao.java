package dev.com.matricula.dao;

import dev.com.matricula.model.Usuario;

public interface UsuarioDao {

  public boolean registrarUsuario(Usuario usuario);

  public Integer obtenerUltimoIdUsuario();

  public Usuario obtenerDatoUsuarioAcceso(String usuario, String clave);

}
