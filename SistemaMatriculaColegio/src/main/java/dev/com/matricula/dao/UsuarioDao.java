/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */

package dev.com.matricula.dao;

import dev.com.matricula.model.Usuario;

/**
 * @author WILLY
 */
public interface UsuarioDao {

  public Usuario obtenerDatoUsuarioAcceso(String usuario, String clave);

}
