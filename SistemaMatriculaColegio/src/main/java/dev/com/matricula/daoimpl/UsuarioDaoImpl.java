package dev.com.matricula.daoimpl;

import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.model.Usuario;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class UsuarioDaoImpl extends SessionFactoryImpl implements UsuarioDao {

  String LOGIN = "login";
  String CLAVE = "clave";
  private Usuario usuario;

  @Override
  public boolean registrarUsuario(Usuario usuario) {
    try {
      Session session = getSessionFactory().openSession();
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
    Session session = getSessionFactory().openSession();
    Query query = session.createSQLQuery("select max(idusuario+1) from Usuario");
    Object obj = query.uniqueResult();
    session.close();
    return Integer.parseInt(obj.toString());
  }

  @Override
  public Usuario obtenerDatoUsuarioAcceso(String login, String clave) {
    Session session = getSessionFactory().openSession();
    session.beginTransaction();
    Criteria criteria = session.createCriteria(Usuario.class);
    criteria.add(Restrictions.eq(LOGIN, login));
    criteria.add(Restrictions.eq(CLAVE, clave));
    usuario = (Usuario) criteria.uniqueResult();
    session.close();
    return usuario;
  }

  @Override
  public String mostrarConsulta() {
    Session session = getSessionFactory().openSession();
    Query query = session.createSQLQuery("select max(idrolusuario+1) from RolUsuario");
    Object obj = query.uniqueResult();
    session.close();
    return obj.toString();
  }

}
