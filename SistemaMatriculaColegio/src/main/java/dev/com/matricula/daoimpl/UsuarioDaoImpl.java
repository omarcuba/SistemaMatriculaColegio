package dev.com.matricula.daoimpl;

import java.util.List;

import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.model.Usuario;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class UsuarioDaoImpl extends SessionFactoryImpl implements UsuarioDao {

  private Session session;
  private Criteria criteria;
  private Query query;
  private int entero;
  private String LOGIN_USUARIO = "login";
  private String CLAVE_USUARIO = "clave";
  private Usuario usuario;
  private List<Usuario> usuarioList;

  @Override
  public boolean registrarUsuario(Usuario usuario) {
    try {
      session = getSessionFactory().openSession();
      session.beginTransaction();
      session.saveOrUpdate(usuario);
      session.getTransaction().commit();
      session.close();
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  @Override
  public Integer obtenerUltimoIdUsuario() {
    session = getSessionFactory().openSession();
    query = session.createSQLQuery("select max(idusuario+1) from Usuario");
    entero = Integer.parseInt(query.uniqueResult().toString());
    session.close();
    return entero;
  }

  @Override
  public Usuario obtenerDatoUsuarioAcceso(String loginUsuario, String claveUsuario) {
    session = getSessionFactory().openSession();
    session.beginTransaction();
    criteria = session.createCriteria(Usuario.class);
    criteria.add(Restrictions.eq(LOGIN_USUARIO, loginUsuario));
    criteria.add(Restrictions.eq(CLAVE_USUARIO, claveUsuario));
    usuario = (Usuario) criteria.uniqueResult();
    session.close();
    return usuario;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Usuario> obtenerUsuario() {
    session = getSessionFactory().openSession();
    session.beginTransaction();
    criteria = session.createCriteria(Usuario.class);
    usuarioList = criteria.list();
    session.close();
    return usuarioList;
  }

}
