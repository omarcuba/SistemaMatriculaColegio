package dev.com.matricula.daoimpl;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.model.Rolusuario;

public class RolUsuarioDaoImpl extends SessionFactoryImpl implements RolUsuarioDao {

  String ID_USUARIO = "usuario.idUsuario";
  private Rolusuario rolUsuario;

  @Override
  public boolean registrarRolUsuario(Rolusuario rolUsuario) {
    try {
      Session session = getSessionFactory().openSession();
      session.beginTransaction();
      session.saveOrUpdate(rolUsuario);
      session.getTransaction().commit();
      session.close();
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public Integer obtenerUltimoIdRolUsuario() {
    Session session = getSessionFactory().openSession();
    Query query = session.createSQLQuery("select max(idrolusuario+1) from RolUsuario");
    Object obj = query.uniqueResult();
    session.close();
    return Integer.parseInt(obj.toString());
  }

  @Override
  public Rolusuario obtenerDatoRolUsuario(String codUsuario) {
    Session session = getSessionFactory().openSession();
    session.beginTransaction();
    Criteria criteria = session.createCriteria(Rolusuario.class);
    criteria.add(Restrictions.eq(ID_USUARIO, Integer.parseInt(codUsuario)));
    rolUsuario = (Rolusuario) criteria.uniqueResult();
    session.close();
    return rolUsuario;
  }

}
