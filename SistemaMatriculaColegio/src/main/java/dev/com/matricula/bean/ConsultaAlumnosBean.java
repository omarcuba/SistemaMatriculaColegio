package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Curso;
import dev.com.matricula.model.Matricula;
import dev.com.matricula.service.ConsultaAlumnosService;
import dev.com.matricula.serviceimpl.ConsultaAlumnosServiceImpl;

@ManagedBean(name = "consultaAlumnos")
@SessionScoped
public class ConsultaAlumnosBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Alumno alumno;
  private Curso curso;
  private Matricula matricula;
  private ArrayList<Matricula> matriculaList;

  private ConsultaAlumnosService consultaAlumnosService;

  public ConsultaAlumnosBean() {
    alumno = new Alumno();
    curso = new Curso();
    matricula = new Matricula();
    obtenerNotasAlumno();
  }

  public List<Matricula> obtenerNotasAlumno() {
    consultaAlumnosService = new ConsultaAlumnosServiceImpl();
    matriculaList = (ArrayList<Matricula>) consultaAlumnosService.obtenerMatriculaAlumno(LoginBean.CODIGO_ALUMNO);
    return matriculaList;

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

  public Matricula getMatricula() {
    return matricula;
  }

  public void setMatricula(Matricula matricula) {
    this.matricula = matricula;
  }

  public ArrayList<Matricula> getMatriculaList() {
    return matriculaList;
  }

  public void setMatriculaList(ArrayList<Matricula> matriculaList) {
    this.matriculaList = matriculaList;
  }

}
