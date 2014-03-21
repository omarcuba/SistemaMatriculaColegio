package dev.com.matricula.bean;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.AlumnoService;
import dev.com.matricula.serviceimpl.AlumnoServiceImpl;

public class AlumnoBean {

  private Alumno alumno;
  private AlumnoService alumnoService = new AlumnoServiceImpl();

  public String registrarAlumno() {
    if (alumnoService.registrarAlumno(alumno)) {
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

  public void setAlumnoService(AlumnoService alumnoService) {
    this.alumnoService = alumnoService;
  }
}
