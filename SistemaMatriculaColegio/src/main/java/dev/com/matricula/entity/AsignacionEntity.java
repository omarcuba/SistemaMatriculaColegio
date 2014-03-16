package dev.com.matricula.entity;

public class AsignacionEntity {
  private String nombreDocente;
  
  public AsignacionEntity(){  
  }

  public AsignacionEntity(String nombreDocente){
    this.nombreDocente=nombreDocente;
  }
  
  public String getNombreDocente() {
    return nombreDocente;
  }

  public void setNombreDocente(String nombreDocente) {
    this.nombreDocente = nombreDocente;
  }
  
}
