package dev.com.matricula.bean;

import javax.faces.bean.ManagedBean;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.AlumnoService;
import dev.com.matricula.serviceimpl.AlumnoServiceImpl;

@ManagedBean(name = "AlumnoBean")
public class AlumnoBean {

  private Alumno alumno;
  private AlumnoService usuarioService = new AlumnoServiceImpl();

  public String registrarAlumno() {
    if (usuarioService.registrarAlumno(alumno)) {
      return "EXITOSO";
    }
    return "FALLIDO";
  }

  public Alumno getAlumno() {
    return alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

}
