package dev.com.matricula.daoimpl;

import java.util.List;

import dev.com.matricula.dao.UsuarioDocenteDao;
import dev.com.matricula.model.UsuarioDocente;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class UsuarioDocenteDaoImpl extends AbstractHibernateDao implements UsuarioDocenteDao {

  private Session session;
  private Criteria criteria;
  private Query query;
  private int entero;
  private String CODIGO_USUARIO = "idUsuario";
  private List<UsuarioDocente> usuarioDocenteList;

  @Override
  public boolean registrarUsuarioDocente(UsuarioDocente usuarioDocente) {
    try {
      session = getSessionFactory().openSession();
      session.beginTransaction();
      session.saveOrUpdate(usuarioDocente);
      session.getTransaction().commit();
      session.close();
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public Integer obtenerUltimoIdUsuarioDocente() {
    session = getSessionFactory().openSession();
    query = session.createSQLQuery("select max(idusuariodocente+1) from UsuarioDocente");
    entero = Integer.parseInt(query.uniqueResult().toString());
    session.close();
    return entero;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<UsuarioDocente> obtenerUsuarioDocentes() {
    session = getSessionFactory().openSession();
    session.beginTransaction();
    criteria = session.createCriteria(UsuarioDocente.class);
    usuarioDocenteList = criteria.list();
    session.close();
    return usuarioDocenteList;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<UsuarioDocente> obtenerIdDocente(int codigoUsuario) {
    session = getSessionFactory().openSession();
    session.beginTransaction();
    criteria = session.createCriteria(UsuarioDocente.class);
    criteria.add(Restrictions.eq(CODIGO_USUARIO, codigoUsuario));
    usuarioDocenteList = criteria.list();
    session.close();
    return usuarioDocenteList;
  }

}
