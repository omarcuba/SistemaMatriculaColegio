package dev.com.matricula.model;

import java.math.BigDecimal;
import java.util.Date;

public class Notas implements java.io.Serializable {

  private static final long serialVersionUID = 1L;
  private int idNotas;
  private Curso curso;
  private Alumno alumno;
  private BigDecimal b1;
  private BigDecimal b2;
  private BigDecimal b3;
  private BigDecimal b4;
  private BigDecimal promedio;
  private Integer codUsuario;
  private Date fechaOperacion;

  public Notas() {
  }

  public Notas(int idNotas, Curso curso, Alumno alumno, BigDecimal b1, BigDecimal b2,
          BigDecimal b3, BigDecimal b4, BigDecimal promedio) {
    this.idNotas = idNotas;
    this.curso = curso;
    this.alumno = alumno;
    this.b1 = b1;
    this.b2 = b2;
    this.b3 = b3;
    this.b4 = b4;
    this.promedio = promedio;
  }

  public Notas(int idNotas, Curso curso, Alumno alumno, BigDecimal b1, BigDecimal b2,
          BigDecimal b3, BigDecimal b4, BigDecimal promedio, Integer codUsuario, Date fechaOperacion) {
    this.idNotas = idNotas;
    this.curso = curso;
    this.alumno = alumno;
    this.b1 = b1;
    this.b2 = b2;
    this.b3 = b3;
    this.b4 = b4;
    this.promedio = promedio;
    this.codUsuario = codUsuario;
    this.fechaOperacion = fechaOperacion;
  }

  public int getIdNotas() {
    return this.idNotas;
  }

  public void setIdNotas(int idNotas) {
    this.idNotas = idNotas;
  }

  public Curso getCurso() {
    return this.curso;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }

  public Alumno getAlumno() {
    return this.alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public BigDecimal getB1() {
    return this.b1;
  }

  public void setB1(BigDecimal b1) {
    this.b1 = b1;
  }

  public BigDecimal getB2() {
    return this.b2;
  }

  public void setB2(BigDecimal b2) {
    this.b2 = b2;
  }

  public BigDecimal getB3() {
    return this.b3;
  }

  public void setB3(BigDecimal b3) {
    this.b3 = b3;
  }

  public BigDecimal getB4() {
    return this.b4;
  }

  public void setB4(BigDecimal b4) {
    this.b4 = b4;
  }

  public BigDecimal getPromedio() {
    return this.promedio;
  }

  public void setPromedio(BigDecimal promedio) {
    this.promedio = promedio;
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
