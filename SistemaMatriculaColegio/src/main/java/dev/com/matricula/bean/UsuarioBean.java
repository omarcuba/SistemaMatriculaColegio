package dev.com.matricula.bean;

import java.io.Serializable;

import dev.com.matricula.model.Rol;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.UsuarioService;
import dev.com.matricula.serviceimpl.UsuarioServiceImpl;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "UsuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Usuario usuario;
  private RolUsuario rolUsuario;
  private Rol rol;
  private UsuarioService usuarioService;
  private String confirma = "";
  private boolean rsptUsuario;
  private boolean rsptAccesoRol;

  public UsuarioBean() {
    usuario = new Usuario();
    rol = new Rol();
    rolUsuario = new RolUsuario();
  }

  public boolean registrarUsuario() {
    if (usuario.getClave().equals(getConfirma())) {

      usuario.setIdUsuario(1010);
      usuario.setEstado('1');// cargar el id mediante una consulta
      usuario.setCodUsuario(LoginBean.COD_USUARIO);
      usuario.setFechaOperacion(null);

      usuarioService = new UsuarioServiceImpl();
      rsptUsuario = usuarioService.registrarUsuario(usuario);

      rol.setIdRol(1);
      rolUsuario.setIdRolUsuario(3);// cargar el id mediante una consulta
      rolUsuario.setRol(rol);
      rolUsuario.setUsuario(usuario);
      rolUsuario.setEstado('1');
      rolUsuario.setCodUsuario(LoginBean.COD_USUARIO);
      rolUsuario.setFechaOperacion(null);

      rsptAccesoRol = usuarioService.registrarAccesoRol(rolUsuario);

      System.out.println("se paso de frente");
      return true;
    }
    System.out.println("no paso de frente");
    return false;
  }

  public RolUsuario getRolUsuario() {
    return rolUsuario;
  }

  public void setRolUsuario(RolUsuario rolUsuario) {
    this.rolUsuario = rolUsuario;
  }

  public Rol getRol() {
    return rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }

  public UsuarioService getUsuarioService() {
    return usuarioService;
  }

  public void setUsuarioService(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
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

  public boolean isRsptUsuario() {
    return rsptUsuario;
  }

  public void setRsptUsuario(boolean rsptUsuario) {
    this.rsptUsuario = rsptUsuario;
  }

  public boolean isRsptAccesoRol() {
    return rsptAccesoRol;
  }

  public void setRsptAccesoRol(boolean rsptAccesoRol) {
    this.rsptAccesoRol = rsptAccesoRol;
  }

}
