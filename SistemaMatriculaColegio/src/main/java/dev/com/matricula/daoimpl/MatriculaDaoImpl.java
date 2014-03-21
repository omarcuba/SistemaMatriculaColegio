package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.MatriculaDao;
import dev.com.matricula.model.Matricula;

public class MatriculaDaoImpl extends AbstractHibernateDao implements MatriculaDao {

  private Session session;
  private Criteria criteria;
  private Query query;
  private int entero;
  private String CODIGO_ANHOESCOLAR = "anhoEscolar.idAnhoEscolar";
  private List<Matricula> matriculaList;

  @Override
  public boolean registrarMatricula(Matricula matricula) {
    try {
      session = getSessionFactory().openSession();
      session.beginTransaction();
      session.saveOrUpdate(matricula);
      session.getTransaction().commit();
      session.close();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public Integer obtenerUltimoIdMatricula() {
    session = getSessionFactory().openSession();
    query = session.createSQLQuery("select max(idmatricula+1) from Matricula");
    entero = Integer.parseInt(query.uniqueResult().toString());
    session.close();
    return entero;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Matricula> obtenerMatriculas() {
    session = getSessionFactory().openSession();
    criteria = session.createCriteria(Matricula.class);
    matriculaList = criteria.list();
    session.close();
    return matriculaList;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Matricula> obtenerMatriculaAlumno(int codigoAnhoEscolar) {
    session = getSessionFactory().openSession();
    criteria = session.createCriteria(Matricula.class);
    criteria.add(Restrictions.eq(CODIGO_ANHOESCOLAR, "2013"));
    matriculaList = criteria.list();
    // session.close();
    return matriculaList;
  }
}
