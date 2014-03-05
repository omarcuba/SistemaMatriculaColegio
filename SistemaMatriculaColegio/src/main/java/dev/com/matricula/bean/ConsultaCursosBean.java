package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Asignacion;
import dev.com.matricula.model.Curso;
import dev.com.matricula.service.ConsultaCursosService;
import dev.com.matricula.serviceimpl.ConsultaCursosServiceImpl;

@ManagedBean(name = "consultaCursos")
@SessionScoped
public class ConsultaCursosBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Alumno alumno;
  private Curso curso;
  private Asignacion asignacion;
  private ArrayList<Asignacion> asignacionList;

  private ConsultaCursosService consultaCursosService;

  public ConsultaCursosBean() {
    alumno = new Alumno();
    curso = new Curso();
    asignacion = new Asignacion();
    obtenerNotasAlumno();
  }

  public List<Asignacion> obtenerNotasAlumno() {
    consultaCursosService = new ConsultaCursosServiceImpl();
    asignacionList = (ArrayList<Asignacion>) consultaCursosService.obtenerCursosAlumno(LoginBean.CODIGO_ALUMNO);
    return asignacionList;

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


}
