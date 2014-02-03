/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */

package dev.com.matricula.service;

import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;

/**
 * @author WILLY
 */
public interface LoginService {

  public Usuario obtenerDatoUsuarioAcceso(String login, String clave);

  public RolUsuario obtenerDatoUsuarioRol(String idUsuario);
}
