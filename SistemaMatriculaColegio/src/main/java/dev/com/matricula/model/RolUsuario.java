package dev.com.matricula.model;

// Generated 02/02/2014 11:46:24 AM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Rolusuario generated by hbm2java
 */
public class RolUsuario implements java.io.Serializable {

  private int idRolUsuario;
  private Usuario usuario;
  private Rol rol;
  private char estado;
  private Integer codUsuario;
  private Date fechaOperacion;

  public RolUsuario() {
  }

  public RolUsuario(int idRolUsuario, Usuario usuario, Rol rol, char estado) {
    this.idRolUsuario = idRolUsuario;
    this.usuario = usuario;
    this.rol = rol;
    this.estado = estado;
  }

  public RolUsuario(int idRolUsuario, Usuario usuario, Rol rol, char estado, Integer codUsuario,
          Date fechaOperacion) {
    this.idRolUsuario = idRolUsuario;
    this.usuario = usuario;
    this.rol = rol;
    this.estado = estado;
    this.codUsuario = codUsuario;
    this.fechaOperacion = fechaOperacion;
  }

  public int getIdRolUsuario() {
    return this.idRolUsuario;
  }

  public void setIdRolUsuario(int idRolUsuario) {
    this.idRolUsuario = idRolUsuario;
  }

  public Usuario getUsuario() {
    return this.usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public Rol getRol() {
    return this.rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }

  public char getEstado() {
    return this.estado;
  }

  public void setEstado(char estado) {
    this.estado = estado;
  }

  public Integer getCodUsuario() {
    return this.codUsuario;
  }

  public void setCodUsuario(Integer codUsuario) {
    this.codUsuario = codUsuario;
  }

  public Date getFechaOperacion() {
    return this.fechaOperacion;
  }

  public void setFechaOperacion(Date fechaOperacion) {
    this.fechaOperacion = fechaOperacion;
  }

}
