package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.NotasDao;
import dev.com.matricula.model.Notas;

public class NotasDaoImpl extends SessionFactoryImpl implements NotasDao {

  private Session session;
  private Criteria criteria;
  private Query query;
  private int entero;
  private String CODIGO_ALUMNO = "alumno.idAlumno";
  private List<Notas> notasList;

  @Override
  public boolean registrarNotas(Notas notas) {
    try {
      session = getSessionFactory().openSession();
      session.beginTransaction();
      session.saveOrUpdate(notas);
      session.getTransaction().commit();
      session.close();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public Integer obtenerUltimoIdNotas() {
    session = getSessionFactory().openSession();
    query = session.createSQLQuery("select max(idnotas+1) from Notas");
    entero = Integer.parseInt(query.uniqueResult().toString());
    session.close();
    return entero;
  }

  @Override
  public List<Notas> obtenerNotas() {
    // Ver si se implementa?
    return null;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Notas> obtenerNotasAlumno(int codigoAlumno) {
    session = getSessionFactory().openSession();
    session.beginTransaction();
    criteria = session.createCriteria(Notas.class);
    criteria.add(Restrictions.eq(CODIGO_ALUMNO, codigoAlumno));
    notasList = criteria.list();
    session.close();
    return notasList;
  }
}
