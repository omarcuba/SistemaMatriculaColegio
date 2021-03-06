package dev.com.matricula.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class Alumno implements java.io.Serializable {

  private int idAlumno;
  private String nombre;
  private String apPaterno;
  private String apMaterno;
  private Date fechaNacimiento;
  private String telefono;
  private String dni;
  private char sexo;
  private String email;
  private Integer codUsuario;
  private Date fechaOperacion;
  @SuppressWarnings("rawtypes")
  private Set parentescos = new HashSet(0);
  @SuppressWarnings("rawtypes")
  private Set matriculas = new HashSet(0);
  @SuppressWarnings("rawtypes")
  private Set notases = new HashSet(0);
  @SuppressWarnings("rawtypes")
  private Set promedios = new HashSet(0);

  public Alumno() {
  }

  public Alumno(int idAlumno, String nombre, String apPaterno, String apMaterno,
          Date fechaNacimiento, String dni, char sexo) {
    this.idAlumno = idAlumno;
    this.nombre = nombre;
    this.apPaterno = apPaterno;
    this.apMaterno = apMaterno;
    this.fechaNacimiento = fechaNacimiento;
    this.dni = dni;
    this.sexo = sexo;
  }

  public Alumno(int idAlumno, String nombre, String apPaterno, String apMaterno,
          Date fechaNacimiento, String telefono, String dni, char sexo, String email,
          Integer codUsuario, Date fechaOperacion, Set parentescos, Set matriculas, Set notases,
          Set promedios) {
    this.idAlumno = idAlumno;
    this.nombre = nombre;
    this.apPaterno = apPaterno;
    this.apMaterno = apMaterno;
    this.fechaNacimiento = fechaNacimiento;
    this.telefono = telefono;
    this.dni = dni;
    this.sexo = sexo;
    this.email = email;
    this.codUsuario = codUsuario;
    this.fechaOperacion = fechaOperacion;
    this.parentescos = parentescos;
    this.matriculas = matriculas;
    this.notases = notases;
    this.promedios = promedios;
  }

  public int getIdAlumno() {
    return this.idAlumno;
  }

  public void setIdAlumno(int idAlumno) {
    this.idAlumno = idAlumno;
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

  public Date getFechaNacimiento() {
    return this.fechaNacimiento;
  }

  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getTelefono() {
    return this.telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getDni() {
    return this.dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public char getSexo() {
    return this.sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
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

  public Set getParentescos() {
    return this.parentescos;
  }

  public void setParentescos(Set parentescos) {
    this.parentescos = parentescos;
  }

  public Set getMatriculas() {
    return this.matriculas;
  }

  public void setMatriculas(Set matriculas) {
    this.matriculas = matriculas;
  }

  public Set getNotases() {
    return this.notases;
  }

  public void setNotases(Set notases) {
    this.notases = notases;
  }

  public Set getPromedios() {
    return this.promedios;
  }

  public void setPromedios(Set promedios) {
    this.promedios = promedios;
  }

}
