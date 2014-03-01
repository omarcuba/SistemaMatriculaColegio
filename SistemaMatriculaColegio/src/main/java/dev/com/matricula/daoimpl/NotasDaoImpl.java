package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.NotasDao;
import dev.com.matricula.model.Notas;

public class NotasDaoImpl extends SessionFactoryImpl implements NotasDao {

  String CODIGO_ALUMNO = "alumno.idAlumno";
  private List<Notas> notasList;

  @Override
  public boolean insertarNotas(Notas notas) {
    try {
      Session session = getSessionFactory().openSession();
      session.beginTransaction();
      session.saveOrUpdate(notas);
      session.getTransaction().commit();
      session.close();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Notas> obtenerNotasAlumno(int codigo) {
    Session session = getSessionFactory().openSession();
    Criteria criteria = session.createCriteria(Notas.class);
    criteria.add(Restrictions.eq(CODIGO_ALUMNO, codigo));
    notasList = criteria.list();
    session.close();
    return notasList;
  }
}
