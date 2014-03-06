package dev.com.matricula.daoimpl;

import java.util.List;

import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.model.Usuarioalumno;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class UsuarioAlumnoDaoImpl extends SessionFactoryImpl implements UsuarioAlumnoDao {

  private Session session;
  private Criteria criteria;
  private Query query;
  private int entero;
  private String CODIGO_USUARIO = "idUsuario";
  private List<Usuarioalumno> usuarioAlumnolist;

  @Override
  public boolean registrarUsuario(Usuarioalumno usuarioAlumno) {
    try {
      session = getSessionFactory().openSession();
      session.beginTransaction();
      session.saveOrUpdate(usuarioAlumno);
      session.getTransaction().commit();
      session.close();
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public Integer obtenerUltimoIdUsuarioAlumno() {
    session = getSessionFactory().openSession();
    query = session.createSQLQuery("select max(idusuarioalumno+1) from UsuarioAlumno");
    entero = Integer.parseInt(query.uniqueResult().toString());
    session.close();
    return entero;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Usuarioalumno> obtenerUsuarioAlumnos() {
    session = getSessionFactory().openSession();
    session.beginTransaction();
    criteria = session.createCriteria(Usuarioalumno.class);
    usuarioAlumnolist = criteria.list();
    session.close();
    return usuarioAlumnolist;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Usuarioalumno> obtenerIdAlumno(int codigoUsuario) {
    session = getSessionFactory().openSession();
    session.beginTransaction();
    criteria = session.createCriteria(Usuarioalumno.class);
    criteria.add(Restrictions.eq(CODIGO_USUARIO, codigoUsuario));
    usuarioAlumnolist = criteria.list();
    session.close();
    return usuarioAlumnolist;
  }

}
