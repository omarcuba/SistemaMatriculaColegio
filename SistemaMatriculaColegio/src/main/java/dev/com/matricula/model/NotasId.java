package dev.com.matricula.model;

// Generated 02/02/2014 11:46:24 AM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * NotasId generated by hbm2java
 */
public class NotasId implements java.io.Serializable {

  private BigDecimal b1;
  private BigDecimal b2;
  private BigDecimal b3;
  private BigDecimal b4;
  private BigDecimal promedio;
  private String idCurso;
  private String idAlumno;
  private Integer codUsuario;
  private Date fechaOperacion;

  public NotasId() {
  }

  public NotasId(BigDecimal b1, BigDecimal b2, BigDecimal b3, BigDecimal b4, BigDecimal promedio,
          String idCurso, String idAlumno) {
    this.b1 = b1;
    this.b2 = b2;
    this.b3 = b3;
    this.b4 = b4;
    this.promedio = promedio;
    this.idCurso = idCurso;
    this.idAlumno = idAlumno;
  }

  public NotasId(BigDecimal b1, BigDecimal b2, BigDecimal b3, BigDecimal b4, BigDecimal promedio,
          String idCurso, String idAlumno, Integer codUsuario, Date fechaOperacion) {
    this.b1 = b1;
    this.b2 = b2;
    this.b3 = b3;
    this.b4 = b4;
    this.promedio = promedio;
    this.idCurso = idCurso;
    this.idAlumno = idAlumno;
    this.codUsuario = codUsuario;
    this.fechaOperacion = fechaOperacion;
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

  public String getIdCurso() {
    return this.idCurso;
  }

  public void setIdCurso(String idCurso) {
    this.idCurso = idCurso;
  }

  public String getIdAlumno() {
    return this.idAlumno;
  }

  public void setIdAlumno(String idAlumno) {
    this.idAlumno = idAlumno;
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

  @Override
  public boolean equals(Object other) {
    if ((this == other))
      return true;
    if ((other == null))
      return false;
    if (!(other instanceof NotasId))
      return false;
    NotasId castOther = (NotasId) other;

    return ((this.getB1() == castOther.getB1()) || (this.getB1() != null
            && castOther.getB1() != null && this.getB1().equals(castOther.getB1())))
            && ((this.getB2() == castOther.getB2()) || (this.getB2() != null
                    && castOther.getB2() != null && this.getB2().equals(castOther.getB2())))
            && ((this.getB3() == castOther.getB3()) || (this.getB3() != null
                    && castOther.getB3() != null && this.getB3().equals(castOther.getB3())))
            && ((this.getB4() == castOther.getB4()) || (this.getB4() != null
                    && castOther.getB4() != null && this.getB4().equals(castOther.getB4())))
            && ((this.getPromedio() == castOther.getPromedio()) || (this.getPromedio() != null
                    && castOther.getPromedio() != null && this.getPromedio().equals(
                    castOther.getPromedio())))
            && ((this.getIdCurso() == castOther.getIdCurso()) || (this.getIdCurso() != null
                    && castOther.getIdCurso() != null && this.getIdCurso().equals(
                    castOther.getIdCurso())))
            && ((this.getIdAlumno() == castOther.getIdAlumno()) || (this.getIdAlumno() != null
                    && castOther.getIdAlumno() != null && this.getIdAlumno().equals(
                    castOther.getIdAlumno())))
            && ((this.getCodUsuario() == castOther.getCodUsuario()) || (this.getCodUsuario() != null
                    && castOther.getCodUsuario() != null && this.getCodUsuario().equals(
                    castOther.getCodUsuario())))
            && ((this.getFechaOperacion() == castOther.getFechaOperacion()) || (this
                    .getFechaOperacion() != null && castOther.getFechaOperacion() != null && this
                    .getFechaOperacion().equals(castOther.getFechaOperacion())));
  }

  @Override
  public int hashCode() {
    int result = 17;

    result = 37 * result + (getB1() == null ? 0 : this.getB1().hashCode());
    result = 37 * result + (getB2() == null ? 0 : this.getB2().hashCode());
    result = 37 * result + (getB3() == null ? 0 : this.getB3().hashCode());
    result = 37 * result + (getB4() == null ? 0 : this.getB4().hashCode());
    result = 37 * result + (getPromedio() == null ? 0 : this.getPromedio().hashCode());
    result = 37 * result + (getIdCurso() == null ? 0 : this.getIdCurso().hashCode());
    result = 37 * result + (getIdAlumno() == null ? 0 : this.getIdAlumno().hashCode());
    result = 37 * result + (getCodUsuario() == null ? 0 : this.getCodUsuario().hashCode());
    result = 37 * result + (getFechaOperacion() == null ? 0 : this.getFechaOperacion().hashCode());
    return result;
  }

}
