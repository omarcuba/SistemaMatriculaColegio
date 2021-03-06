package dev.com.matricula.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import dev.com.matricula.model.Rol;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.UsuarioService;

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

  public String registrarUsuario() {
    FacesContext context = FacesContext.getCurrentInstance();
    if (usuario.getClave().equals(getConfirma())) {

      // Completando los Datos para la entidad Usuario
      usuario.setIdUsuario(usuarioService.buscarUltimoidUsuario());
      usuario.setEstado('1');
      usuario.setCodUsuario(LoginBean.COD_USUARIO);
      usuario.setFechaOperacion(null);
      rsptUsuario = usuarioService.registrarUsuario(usuario);

      // Completando los Datos para un Rol de un nuevo Usuario
      if (rsptUsuario) {
        rol.setIdRol(1);
        rolUsuario.setIdRolUsuario(usuarioService.buscarUltimoidRolUsuario());
        rolUsuario.setRol(rol);
        rolUsuario.setUsuario(usuario);
        rolUsuario.setEstado('1');
        rolUsuario.setCodUsuario(LoginBean.COD_USUARIO);
        rolUsuario.setFechaOperacion(null);
        rsptAccesoRol = usuarioService.registrarAccesoRol(rolUsuario);
        if (rsptAccesoRol) {
          context.addMessage(null, new FacesMessage("Resultado", "Se registro Correctamente"));
          return "LOGIN";
        }
      }
    }
    context.addMessage(null, new FacesMessage("Error en confirmaci�n de contrase�a",
            "No se pudo Registrar"));
    return "REGISTRAR_USUARIO";
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

  public void setUsuarioService(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
  }
}
