package dev.com.matricula.dao;

import dev.com.matricula.model.Usuario;

public interface UsuarioDao {

  public boolean insertarUsuario(Usuario usuario);

  public String obtenerUltimoIdUsuario();

  public Usuario obtenerDatoUsuarioAcceso(String usuario, String clave);

}
