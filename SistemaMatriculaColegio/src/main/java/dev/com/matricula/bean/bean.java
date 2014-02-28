package dev.com.matricula.bean;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import dev.com.matricula.model.Notas;
import dev.com.matricula.dao.dao;
import dev.com.matricula.daoimpl.daoimpl;

public class bean implements Serializable {

  public static void main(String[] args) {
    System.out.println("ESTOS DATOS SE MUESTRAN EN LA CONSOLA");
    System.out.println("DATO: " + mostrarConsulta());
  }

  private static final long serialVersionUID = 1L;

  public static boolean mostrarConsulta() {
    dao daoo = new daoimpl();
    String mostrar = daoo.mostrarConsulta();
    System.out.println("Este dato Retorna: " + mostrar);
    return false;
  }

  public static List<Notas> notasa(String codigo) {
    dao daoo = new daoimpl();
    ArrayList<Notas> notasLista = (ArrayList<Notas>) daoo.mostrarNotas("1001");
    System.out.println("Este dato Retorna: " + notasLista);
    return notasLista;
  }

}
