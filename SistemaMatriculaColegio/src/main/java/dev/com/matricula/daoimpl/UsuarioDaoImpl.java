package dev.com.matricula.daoimpl;

import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.model.RolUsuario;
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
  public boolean insertarUsuario(Usuario usuario) {
    try {
      System.out.println("id : " + usuario.getIdUsuario());
      System.out.println("nombre : " + usuario.getNombre());
      System.out.println("appaterno : " + usuario.getApPaterno());
      System.out.println("apmaterno : " + usuario.getApMaterno());
      System.out.println("dni : " + usuario.getDni());
      System.out.println("Login : " + usuario.getLogin());
      System.out.println("clave : " + usuario.getClave());
      System.out.println("estado : " + usuario.getEstado());
      System.out.println("codUsaurio : " + usuario.getCodUsuario());
      System.out.println("fechacreacion : " + usuario.getFechaOperacion());
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public String obtenerUltimoIdUsuario() {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    Criteria criteria = session.createCriteria(RolUsuario.class);
    // criteria.add(Restrictions.();
    usuario = (Usuario) criteria.uniqueResult();
    session.close();
    String Codigo = "";
    return Codigo;
  }

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
