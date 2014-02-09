/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */

package dev.com.matricula.bean;

import java.io.Serializable;

import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.LoginService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author WILLY
 */
@ManagedBean(name = "UsuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private Usuario usuario;
  private LoginService loginService;
  private String confirma = "";

  public UsuarioBean() {
    usuario = new Usuario();
  }

  public void InsertarUsuario() {

  }

  public LoginService getLoginService() {
    return loginService;
  }

  public void setLoginService(LoginService loginService) {
    this.loginService = loginService;
  }

  public String getConfirma() {
    return confirma;
  }

  public void setConfirma(String confirma) {
    this.confirma = confirma;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

}
