package dev.com.matricula.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.ConsultaDatoAlumnoService;
import dev.com.matricula.serviceimpl.ConsultaDatoAlumnoServiceImpl;

@ManagedBean(name = "consultaDatoAlumno")
@SessionScoped
public class consultaDatoAlumnoBean {

  private Alumno alumno;
  private ConsultaDatoAlumnoService consultaDatoAlumnoService;

  public consultaDatoAlumnoBean() {
    alumno = new Alumno();
  }

  public Alumno obtenerDatosAlumno() {
    consultaDatoAlumnoService = new ConsultaDatoAlumnoServiceImpl();
    alumno = consultaDatoAlumnoService.obtenerDatoAlumno("1001");
    return alumno;
  }

  public Alumno getAlumno() {
    return alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public ConsultaDatoAlumnoService getConsultaDatoAlumnoService() {
    return consultaDatoAlumnoService;
  }

  public void setConsultaDatoAlumnoService(ConsultaDatoAlumnoService consultaDatoAlumnoService) {
    this.consultaDatoAlumnoService = consultaDatoAlumnoService;
  }

}
