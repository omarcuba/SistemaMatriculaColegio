package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Apoderado;
import dev.com.matricula.model.Rol;
import dev.com.matricula.model.Rolusuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.Usuarioalumno;
import dev.com.matricula.service.MatriculaManteApoderadoService;
import dev.com.matricula.serviceimpl.MatriculaManteApoderadoServiceImpl;

@ManagedBean(name = "matriculaManteApoderado")
@SessionScoped
public class matriculaMantenimientoApoderadoBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Map<String, String> sexoMap = new HashMap<String, String>();
  private Map<String, String> civilMap = new HashMap<String, String>();
  private Alumno alumno;
  private Apoderado apoderado;
  private Usuario usuario;
  private Usuarioalumno usuarioAlumno;
  private Rol rol;
  private Rolusuario rolUsuario;
  private MatriculaManteApoderadoService matriculaManteApoderadoService;

  public matriculaMantenimientoApoderadoBean() {
    sexoMap.put("Masculino", "M");
    sexoMap.put("Femenino", "F");
    civilMap.put("Soltero", "S");
    civilMap.put("Casado", "C");
    civilMap.put("Viudo", "V");
    civilMap.put("Divorciado", "D");
    alumno = new Alumno();
    apoderado = new Apoderado();
    usuario = new Usuario();
    rolUsuario = new Rolusuario();
    rol = new Rol();
    usuarioAlumno = new Usuarioalumno();
  }

  public String registrarApoderado() {
    matriculaManteApoderadoService = new MatriculaManteApoderadoServiceImpl();
    apoderado.setIdApoderado(matriculaManteApoderadoService.buscarUltimoidApoderado());
    apoderado.setCodUsuario(LoginBean.COD_USUARIO);
    // Registrar Alumno
    boolean rsptApoderado = matriculaManteApoderadoService.registrarApoderado(apoderado);

    // Registrar Usuario
    usuario.setIdUsuario(matriculaManteApoderadoService.buscarUltimoidUsuario());
    usuario.setNombre(apoderado.getNombre());
    usuario.setApMaterno(apoderado.getApMaterno());
    usuario.setApPaterno(apoderado.getApPaterno());
    usuario.setDni(apoderado.getDni());
    usuario.setLogin(apoderado.getNombre() + apoderado.getApPaterno());
    usuario.setClave("12345");
    usuario.setEstado('0');
    usuario.setCodUsuario(LoginBean.COD_USUARIO);
    boolean rsptUsuario = matriculaManteApoderadoService.registrarUsuario(usuario);

    // Registrar Rol de Acceso
    rol.setIdRol(2);
    rolUsuario.setIdRolUsuario(matriculaManteApoderadoService.buscarUltimoidRolUsuario());
    rolUsuario.setRol(rol);
    rolUsuario.setUsuario(usuario);
    rolUsuario.setEstado('1');
    rolUsuario.setCodUsuario(LoginBean.COD_USUARIO);
    boolean rsptRolUsuario = matriculaManteApoderadoService.registrarRolUsuario(rolUsuario);
    
    //Apoderado para al alumno
    alumno.setIdAlumno(1009);
    
    //Registrar Usuario_Alumno
    usuarioAlumno.setIdUsuarioAlumno(matriculaManteApoderadoService.buscarUltimoidUsuarioAlumno());
    usuarioAlumno.setIdUsuario(usuario.getIdUsuario());
    usuarioAlumno.setIdAlumno(alumno.getIdAlumno());
    usuarioAlumno.setCodUsuario(LoginBean.COD_USUARIO);
    boolean rsptUsuarioAlumno = matriculaManteApoderadoService.registrarUsuarioAlumno(usuarioAlumno);

    if (rsptApoderado && rsptUsuario && rsptRolUsuario && rsptUsuarioAlumno)
      return "MATRICULA";

    return "FALLIDO";
  }

  public Map<String, String> getSexoMap() {
    return sexoMap;
  }

  public void setSexoMap(Map<String, String> sexoMap) {
    this.sexoMap = sexoMap;
  }

  public Map<String, String> getCivilMap() {
    return civilMap;
  }

  public void setCivilMap(Map<String, String> civilMap) {
    this.civilMap = civilMap;
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

  public Usuarioalumno getUsuarioAlumno() {
    return usuarioAlumno;
  }

  public void setUsuarioAlumno(Usuarioalumno usuarioAlumno) {
    this.usuarioAlumno = usuarioAlumno;
  }

  public Apoderado getApoderado() {
    return apoderado;
  }

  public void setApoderado(Apoderado apoderado) {
    this.apoderado = apoderado;
  }

}
