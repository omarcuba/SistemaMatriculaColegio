package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.ArrayList;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Asignacion;
import dev.com.matricula.model.Curso;
import dev.com.matricula.service.ConsultaCursosService;

public class ConsultaCursoBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Alumno alumno;
  private Curso curso;
  private Asignacion asignacion;
  private ArrayList<Asignacion> asignacionList;
  private ConsultaCursosService consultaCursoService;

  public ConsultaCursoBean() {
    alumno = new Alumno();
    curso = new Curso();
    asignacion = new Asignacion();
  }

  public String obtenerCursosAlumno() {
    asignacionList =
            (ArrayList<Asignacion>) consultaCursoService
                    .obtenerCursosAlumno(LoginBean.CODIGO_ALUMNO);
    return "/pages/consultaCursos.xhtml";

  }

  public Alumno getAlumno() {
    return alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public Curso getCurso() {
    return curso;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }

  public Asignacion getAsignacion() {
    return asignacion;
  }

  public void setAsignacion(Asignacion asignacion) {
    this.asignacion = asignacion;
  }

  public ArrayList<Asignacion> getAsignacionList() {
    return asignacionList;
  }

  public void setAsignacionList(ArrayList<Asignacion> asignacionList) {
    this.asignacionList = asignacionList;
  }

  public void setConsultaCursoService(ConsultaCursosService consultaCursoService) {
    this.consultaCursoService = consultaCursoService;
  }

}
