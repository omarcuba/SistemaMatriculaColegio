package dev.com.matricula.bean;

import java.io.Serializable;

import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.LoginService;
import dev.com.matricula.serviceimpl.LoginServiceImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Usuario usuario;
  private RolUsuario rolUsuario;
  private LoginService loginService;
  private String ruta = "";
  private String idUsuario = "";
  private String rol = "";
  public static String USUARIO = "";
  public static int COD_USUARIO;

  public LoginBean() {
    usuario = new Usuario();
    rolUsuario = new RolUsuario();
  }

  public String login() {
    String retorno = "INICIO";
    if (!this.usuario.getLogin().isEmpty() && !this.usuario.getClave().isEmpty()) {
      loginService = new LoginServiceImpl();
      usuario = loginService.obtenerDatoUsuarioAcceso(usuario.getLogin(), usuario.getClave());
      if (usuario != null) {
        this.idUsuario = "" + usuario.getIdUsuario();
        USUARIO = usuario.getLogin();
        COD_USUARIO = usuario.getIdUsuario();
        rolUsuario = loginService.obtenerDatoUsuarioRol(getIdUsuario());
        if (rolUsuario != null) {
          this.rol = "" + rolUsuario.getRol().getIdRol();
          if (getRol().equals("1")) {
            retorno = "INTRANET";
          }
          if (getRol().equals("2")) {
            retorno = "INTRANET";
          }
        }
      }
    }
    return retorno;
  }

  public LoginService getLoginService() {
    return loginService;
  }

  public void setLoginService(LoginService loginService) {
    this.loginService = loginService;
  }

  public String getRuta() {
    return ruta;
  }

  public void setRuta(String ruta) {
    this.ruta = ruta;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public RolUsuario getRolUsuario() {
    return rolUsuario;
  }

  public void setRolUsuario(RolUsuario rolUsuario) {
    this.rolUsuario = rolUsuario;
  }

  public String getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(String idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getRol() {
    return rol;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }

}
