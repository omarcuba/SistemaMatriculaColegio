package dev.com.matricula.model;

// Generated 02/02/2014 11:46:24 AM by Hibernate Tools 4.0.0

/**
 * Parentesco generated by hbm2java
 */
public class Parentesco implements java.io.Serializable {

  private ParentescoId id;
  private Alumno alumno;
  private Apoderado apoderado;

  public Parentesco() {
  }

  public Parentesco(ParentescoId id, Alumno alumno, Apoderado apoderado) {
    this.id = id;
    this.alumno = alumno;
    this.apoderado = apoderado;
  }

  public ParentescoId getId() {
    return this.id;
  }

  public void setId(ParentescoId id) {
    this.id = id;
  }

  public Alumno getAlumno() {
    return this.alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public Apoderado getApoderado() {
    return this.apoderado;
  }

  public void setApoderado(Apoderado apoderado) {
    this.apoderado = apoderado;
  }

}
