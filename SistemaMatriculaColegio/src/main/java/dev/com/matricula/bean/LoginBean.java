package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.ArrayList;

import dev.com.matricula.model.Rolusuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.Usuarioalumno;
import dev.com.matricula.service.LoginService;
import dev.com.matricula.serviceimpl.LoginServiceImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Usuario usuario;
  private Rolusuario rolUsuario;
  private LoginService loginService;
  private ArrayList<Usuarioalumno> usuarioAlumnosList;
  private String ruta = "";
  private String rol = "";
  private int seleccionAlumno = 0;
  private String datoUsuarioVisita;
  private String tipoUsuario = "No Existe";
  public static String USUARIO = "";
  public static int COD_USUARIO;
  public static int CODIGO_ALUMNO;

  public LoginBean() {
    usuario = new Usuario();
    rolUsuario = new Rolusuario();
  }

  public String login() {
    String retorno = "LOGIN";
    if (!this.usuario.getLogin().isEmpty() && !this.usuario.getClave().isEmpty()) {
      loginService = new LoginServiceImpl();
      // Validando Usuario
      usuario = loginService.obtenerDatoUsuarioAcceso(usuario.getLogin(), usuario.getClave());
      if (usuario != null) {
        COD_USUARIO = usuario.getIdUsuario();
        USUARIO = usuario.getLogin();
        // Validando el Rol
        rolUsuario = loginService.obtenerDatoUsuarioRol(COD_USUARIO);
        if (rolUsuario != null) {
          rol = "" + rolUsuario.getRol().getIdRol();
          if (getRol().equals("1")) {
            tipoUsuario = "ALUMNO";
            retorno = "CONSULTAS";
          }
          if (getRol().equals("2")) {
            tipoUsuario = "APODERADO";
            retorno = "CONSULTAS";
          }
          if (getRol().equals("3")) {
            tipoUsuario = "DOCENTE";
            retorno = "DOCENTE";
          }
          if (getRol().equals("4")) {
            tipoUsuario = "MATRICULANTE";
            retorno = "MATRICULA";
          }
          if (getRol().equals("5")) {
            tipoUsuario = "ADMINISTRADOR";
            retorno = "ADMINISTRADOR";
          }
          obtenerDatosAlumno();
          obtenerDatoUsuarioDeVisita();
        }
      }
    }
    return retorno;
  }

  private void obtenerDatosAlumno() {
    loginService = new LoginServiceImpl();
    usuarioAlumnosList = (ArrayList<Usuarioalumno>) loginService.obtenerIdAlumno(COD_USUARIO);
    // Se necesita análisis para colocar el valor del tipo de alumno para
    // mostrar con "SELECCIONALUMNO"
    // Dato que se ingresara por necesidad de Usuario
    CODIGO_ALUMNO = usuarioAlumnosList.get(seleccionAlumno).getIdAlumno();
  }

  private void obtenerDatoUsuarioDeVisita() {
    if (usuario != null) {
      datoUsuarioVisita =
              usuario.getNombre() + " " + usuario.getApPaterno() + " " + usuario.getApMaterno();
    }
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

  public Rolusuario getRolUsuario() {
    return rolUsuario;
  }

  public void setRolUsuario(Rolusuario rolUsuario) {
    this.rolUsuario = rolUsuario;
  }

  public String getRol() {
    return rol;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }

  public int getSeleccionAlumno() {
    return seleccionAlumno;
  }

  public void setSeleccionAlumno(int seleccionAlumno) {
    this.seleccionAlumno = seleccionAlumno;
  }

  public ArrayList<Usuarioalumno> getUsuarioAlumnosList() {
    return usuarioAlumnosList;
  }

  public void setUsuarioAlumnosList(ArrayList<Usuarioalumno> usuarioAlumnosList) {
    this.usuarioAlumnosList = usuarioAlumnosList;
  }

  public String getDatoUsuarioVisita() {
    return datoUsuarioVisita;
  }

  public void setDatoUsuarioVisita(String datoUsuarioVisita) {
    this.datoUsuarioVisita = datoUsuarioVisita;
  }

  public String getTipoUsuario() {
    return tipoUsuario;
  }

  public void setTipoUsuario(String tipoUsuario) {
    this.tipoUsuario = tipoUsuario;
  }

}
