package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Curso;
import dev.com.matricula.model.Notas;
import dev.com.matricula.service.ConsultaNotasService;
import dev.com.matricula.serviceimpl.ConsultaNotasServiceImpl;

@ManagedBean(name = "consultaNotas")
@SessionScoped
public class ConsultaNotasBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Alumno alumno;
  private Curso curso;
  private Notas notas;
  private ArrayList<Notas> notasList;

  private ConsultaNotasService consultaNotasService;

  public ConsultaNotasBean() {
    alumno = new Alumno();
    curso = new Curso();
    notas = new Notas();
    // obtenerDatosAlumno();
  }

  public List<Notas> obtenerNotasAlumno() {
    consultaNotasService = new ConsultaNotasServiceImpl();
    // Se debe realizar la consulta mediante la BD iniciada por el usuario
    // obteniendo as� el codigo del alumno al cual consultar
    notasList = (ArrayList<Notas>) consultaNotasService.obtenerNotasAlumno("1001");
    return notasList;

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

  public Notas getNotas() {
    return notas;
  }

  public void setNotas(Notas notas) {
    this.notas = notas;
  }

  public ArrayList<Notas> getNotasList() {
    return notasList;
  }

  public void setNotasList(ArrayList<Notas> notasList) {
    this.notasList = notasList;
  }

  public ConsultaNotasService getConsultaNotasService() {
    return consultaNotasService;
  }

  public void setConsultaNotasService(ConsultaNotasService consultaNotasService) {
    this.consultaNotasService = consultaNotasService;
  }

}
