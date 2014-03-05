package dev.com.matricula.model;

import java.util.Date;

public class Asignacion implements java.io.Serializable {

  private static final long serialVersionUID = 1L;
  private int idAsignacion;
  private Docente docente;
  private Curso curso;
  private Anhoescolar anhoescolar;
  private char seccion;
  private Integer codUsuario;
  private Date fechaOperacion;

  public Asignacion() {
  }

  public Asignacion(int idAsignacion, Docente docente, Curso curso, Anhoescolar anhoescolar,
          char seccion) {
    this.idAsignacion = idAsignacion;
    this.docente = docente;
    this.curso = curso;
    this.anhoescolar = anhoescolar;
    this.seccion = seccion;
  }

  public Asignacion(int idAsignacion, Docente docente, Curso curso, Anhoescolar anhoescolar,
          char seccion, Integer codUsuario, Date fechaOperacion) {
    this.idAsignacion = idAsignacion;
    this.docente = docente;
    this.curso = curso;
    this.anhoescolar = anhoescolar;
    this.seccion = seccion;
    this.codUsuario = codUsuario;
    this.fechaOperacion = fechaOperacion;
  }

  public int getIdAsignacion() {
    return this.idAsignacion;
  }

  public void setIdAsignacion(int idAsignacion) {
    this.idAsignacion = idAsignacion;
  }

  public Docente getDocente() {
    return this.docente;
  }

  public void setDocente(Docente docente) {
    this.docente = docente;
  }

  public Curso getCurso() {
    return this.curso;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }

  public Anhoescolar getAnhoescolar() {
    return this.anhoescolar;
  }

  public void setAnhoescolar(Anhoescolar anhoescolar) {
    this.anhoescolar = anhoescolar;
  }

  public char getSeccion() {
    return this.seccion;
  }

  public void setSeccion(char seccion) {
    this.seccion = seccion;
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
