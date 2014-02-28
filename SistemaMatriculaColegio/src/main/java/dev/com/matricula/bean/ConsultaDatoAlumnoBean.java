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

  public Alumno obtenerDatosAlumno() {
    consultaDatoAlumnoService = new ConsultaDatoAlumnoServiceImpl();
    // Se debe realizar la consulta mediante la BD iniciada por el usuario
    // obteniendo así el codigo del alumno al cual consultar
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
