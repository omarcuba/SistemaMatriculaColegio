package dev.com.matricula.model;

// Generated 02/02/2014 11:46:24 AM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Apoderado generated by hbm2java
 */
public class Apoderado implements java.io.Serializable {

  private String idApoderado;
  private String dni;
  private String nombre;
  private String apPaterno;
  private String apMaterno;
  private char sexo;
  private String direccion;
  private Character estadoCivil;
  private String telefono;
  private Integer codUsuario;
  private Date fechaOperacion;
  private Set matriculas = new HashSet(0);
  private Set parentescos = new HashSet(0);

  public Apoderado() {
  }

  public Apoderado(String idApoderado, String dni, String nombre, String apPaterno,
          String apMaterno, char sexo) {
    this.idApoderado = idApoderado;
    this.dni = dni;
    this.nombre = nombre;
    this.apPaterno = apPaterno;
    this.apMaterno = apMaterno;
    this.sexo = sexo;
  }

  public Apoderado(String idApoderado, String dni, String nombre, String apPaterno,
          String apMaterno, char sexo, String direccion, Character estadoCivil, String telefono,
          Integer codUsuario, Date fechaOperacion, Set matriculas, Set parentescos) {
    this.idApoderado = idApoderado;
    this.dni = dni;
    this.nombre = nombre;
    this.apPaterno = apPaterno;
    this.apMaterno = apMaterno;
    this.sexo = sexo;
    this.direccion = direccion;
    this.estadoCivil = estadoCivil;
    this.telefono = telefono;
    this.codUsuario = codUsuario;
    this.fechaOperacion = fechaOperacion;
    this.matriculas = matriculas;
    this.parentescos = parentescos;
  }

  public String getIdApoderado() {
    return this.idApoderado;
  }

  public void setIdApoderado(String idApoderado) {
    this.idApoderado = idApoderado;
  }

  public String getDni() {
    return this.dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApPaterno() {
    return this.apPaterno;
  }

  public void setApPaterno(String apPaterno) {
    this.apPaterno = apPaterno;
  }

  public String getApMaterno() {
    return this.apMaterno;
  }

  public void setApMaterno(String apMaterno) {
    this.apMaterno = apMaterno;
  }

  public char getSexo() {
    return this.sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public String getDireccion() {
    return this.direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public Character getEstadoCivil() {
    return this.estadoCivil;
  }

  public void setEstadoCivil(Character estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  public String getTelefono() {
    return this.telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
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

  public Set getMatriculas() {
    return this.matriculas;
  }

  public void setMatriculas(Set matriculas) {
    this.matriculas = matriculas;
  }

  public Set getParentescos() {
    return this.parentescos;
  }

  public void setParentescos(Set parentescos) {
    this.parentescos = parentescos;
  }

}
