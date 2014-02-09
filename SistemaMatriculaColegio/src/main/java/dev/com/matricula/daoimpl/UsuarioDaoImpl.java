package dev.com.matricula.daoimpl;

import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.util.HibernateUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class UsuarioDaoImpl implements UsuarioDao {

  String LOGIN = "login";
  String CLAVE = "clave";
  private Usuario usuario;

  @Override
  public Usuario obtenerDatoUsuarioAcceso(String login, String clave) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    Criteria criteria = session.createCriteria(Usuario.class);
    criteria.add(Restrictions.eq(LOGIN, login));
    criteria.add(Restrictions.eq(CLAVE, clave));
    usuario = (Usuario) criteria.uniqueResult();
    session.close();
    return usuario;
  }

}
