package dev.com.matricula.daoimpl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.util.HibernateUtil;

public class RolUsuarioDaoImpl implements RolUsuarioDao {

  String ID_USUARIO = "usuario.idUsuario";
  private RolUsuario rolUsuario;

  @Override
  public boolean insertarRolUsuario(RolUsuario rolUsuario) {
    try {
      System.out.println("********************************");
      System.out.println("id rol usuario : " + rolUsuario.getIdRolUsuario());
      System.out.println("id de rol : " + rolUsuario.getRol().getIdRol());
      System.out.println("id usuario : " + rolUsuario.getUsuario().getIdUsuario());
      System.out.println("estado : " + rolUsuario.getEstado());
      System.out.println("codigo registro : " + rolUsuario.getCodUsuario());
      System.out.println("fecha registo : " + rolUsuario.getFechaOperacion());
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public String obtenerUltimoIdRolUsuario() {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    String ultimo = "1";
    Criteria criteria = session.createCriteria(RolUsuario.class);
    criteria.add(Restrictions.eq(ID_USUARIO, ultimo));
    rolUsuario = (RolUsuario) criteria.uniqueResult();
    session.close();
    String Codigo = "";
    return Codigo;
  }

  @Override
  public RolUsuario obtenerDatoRolUsuario(String codUsuario) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    Criteria criteria = session.createCriteria(RolUsuario.class);
    criteria.add(Restrictions.eq(ID_USUARIO, Integer.parseInt(codUsuario)));
    rolUsuario = (RolUsuario) criteria.uniqueResult();
    session.close();
    return rolUsuario;
  }

}
