package dev.com.matricula.daoimpl;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import java.util.ArrayList;

import dev.com.matricula.dao.dao;
import dev.com.matricula.model.Notas;

public class daoimpl extends SessionFactoryImpl implements dao {

  @Override
  public String mostrarConsulta() {
    Session session = getSessionFactory().openSession();
    Query query = session.createSQLQuery("select max(idrolusuario+1) from RolUsuario");
    Object obj = query.uniqueResult();
    session.close();
    return obj.toString();
  }

  private ArrayList<Notas> lista;
  String CODIGO_ALUMNO = "idAlumno";

  @SuppressWarnings("unchecked")
  @Override
  public List<Notas> mostrarNotas(String codigo) {
    Session session = getSessionFactory().openSession();
    session.beginTransaction();
    Criteria criteria = session.createCriteria(Notas.class);
    criteria.add(Restrictions.eq(CODIGO_ALUMNO, codigo));
    lista = (ArrayList<Notas>) criteria.list();
    System.out.println("lis: " + lista);
    session.close();
    return lista;
  }
}
