package dev.com.matricula.bean;

import java.io.Serializable;

import dev.com.matricula.model.Alumno;
import dev.com.matricula.service.ConsultaDatoAlumnoService;

public class ConsultaDatoAlumnoBean implements Serializable {

  private static final long serialVersionUID = 1L;
  private Alumno alumno;
  private ConsultaDatoAlumnoService consultaDatoAlumnoService;

  public ConsultaDatoAlumnoBean() {
    alumno = new Alumno();
  }

  public String obtenerDatosAlumno() {
    alumno = consultaDatoAlumnoService.obtenerDatoAlumno(LoginBean.CODIGO_ALUMNO);
    System.out.println("Alumno: " + alumno.getNombre()); // No vuelve a cargar
                                                         // para la segunda vez
    return "/pages/consultaDatoAlumno.xhtml";
  }

  public Alumno getAlumno() {
    return alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public void setConsultaDatoAlumnoService(ConsultaDatoAlumnoService consultaDatoAlumnoService) {
    this.consultaDatoAlumnoService = consultaDatoAlumnoService;
  }

}
