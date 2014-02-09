package dev.com.matricula.dao;

import dev.com.matricula.model.Usuario;

public interface UsuarioDao {

  public Usuario obtenerDatoUsuarioAcceso(String usuario, String clave);

}
