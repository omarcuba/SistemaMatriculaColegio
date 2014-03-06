package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Rol;
import dev.com.matricula.model.Rolusuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.MatriculaManteAlumnoService;
import dev.com.matricula.serviceimpl.MatriculaManteAlumnoServiceImpl;

@ManagedBean(name = "matriculaManteAlumno")
@SessionScoped
public class matriculaMantenimientoAlumnoBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Map<String, String> sexoMap = new HashMap<String, String>();
  private Alumno alumno;
  private Usuario usuario;
  private Rol rol;
  private Rolusuario rolUsuario;
  private MatriculaManteAlumnoService matriculaManteAlumnoService;

  public matriculaMantenimientoAlumnoBean() {
    sexoMap.put("Masculino", "M");
    sexoMap.put("Femenino", "F");
    alumno = new Alumno();
    usuario = new Usuario();
    rolUsuario = new Rolusuario();
    rol = new Rol();
  }

  public String registrarAlumno() {
    matriculaManteAlumnoService = new MatriculaManteAlumnoServiceImpl();
    alumno.setIdAlumno(matriculaManteAlumnoService.buscarUltimoidAlumno());
    alumno.setCodUsuario(LoginBean.COD_USUARIO);
    // Registrar Alumno
    boolean rsptAlumno = matriculaManteAlumnoService.registrarAlumno(alumno);

    // Registrar Usuario
    usuario.setIdUsuario(matriculaManteAlumnoService.buscarUltimoidUsuario());
    usuario.setNombre(alumno.getNombre());
    usuario.setApMaterno(alumno.getApMaterno());
    usuario.setApPaterno(alumno.getApPaterno());
    usuario.setDni(alumno.getDni());
    usuario.setLogin(alumno.getNombre() + alumno.getApPaterno());
    usuario.setClave("123456");
    usuario.setEstado('0');
    usuario.setCodUsuario(LoginBean.COD_USUARIO);
    boolean rsptUsuario = matriculaManteAlumnoService.registrarUsuario(usuario);

    // Registrar Rol de Acceso
    rol.setIdRol(1);
    rolUsuario.setIdRolUsuario(matriculaManteAlumnoService.buscarUltimoidRolUsuario());
    rolUsuario.setRol(rol);
    rolUsuario.setUsuario(usuario);
    rolUsuario.setEstado('1');
    rolUsuario.setCodUsuario(LoginBean.COD_USUARIO);
    boolean rsptRolUsuario = matriculaManteAlumnoService.registrarRolUsuario(rolUsuario);

    if (rsptAlumno && rsptUsuario && rsptRolUsuario)
      return "MATRICULA";

    return "FALLIDO";
  }

  public Map<String, String> getSexoMap() {
    return sexoMap;
  }

  public void setSexoMap(Map<String, String> sexoMap) {
    this.sexoMap = sexoMap;
  }

  public Alumno getAlumno() {
    return alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
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

  public Rol getRol() {
    return rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }

}
