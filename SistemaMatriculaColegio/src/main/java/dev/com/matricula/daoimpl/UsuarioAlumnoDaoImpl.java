package dev.com.matricula.daoimpl;

import java.util.List;

import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.model.UsuarioAlumno;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class UsuarioAlumnoDaoImpl extends AbstractHibernateDao implements UsuarioAlumnoDao {

  private Session session;
  private Criteria criteria;
  private Query query;
  private int entero;
  private String CODIGO_USUARIO = "idUsuario";
  private List<UsuarioAlumno> usuarioAlumnolist;

  @Override
  public boolean registrarUsuarioAlumno(UsuarioAlumno usuarioAlumno) {
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
  public List<UsuarioAlumno> obtenerUsuarioAlumnos() {
    session = getSessionFactory().openSession();
    session.beginTransaction();
    criteria = session.createCriteria(UsuarioAlumno.class);
    usuarioAlumnolist = criteria.list();
    session.close();
    return usuarioAlumnolist;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<UsuarioAlumno> obtenerIdAlumno(int codigoUsuario) {
    session = getSessionFactory().openSession();
    session.beginTransaction();
    criteria = session.createCriteria(UsuarioAlumno.class);
    criteria.add(Restrictions.eq(CODIGO_USUARIO, codigoUsuario));
    usuarioAlumnolist = criteria.list();
    session.close();
    return usuarioAlumnolist;
  }

}
