package dev.com.matricula.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.ConsultaDatoAlumnoService;
import dev.com.matricula.serviceimpl.ConsultaDatoAlumnoServiceImpl;

@ManagedBean(name = "consultaDatoAlumno")
@SessionScoped
public class ConsultaDatoAlumnoBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Alumno alumno;
  private ConsultaDatoAlumnoService consultaDatoAlumnoService;

  public ConsultaDatoAlumnoBean() {
    alumno = new Alumno();
    obtenerDatosAlumno();
  }

  private Alumno obtenerDatosAlumno() {
    consultaDatoAlumnoService = new ConsultaDatoAlumnoServiceImpl();
    alumno = consultaDatoAlumnoService.obtenerDatoAlumno(LoginBean.CODIGO_ALUMNO);
    System.out.println("Alumno: " + alumno.getNombre()); // No vuelve a cargar
                                                         // para la segunda vez
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
