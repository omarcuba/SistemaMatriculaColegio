package dev.com.matricula.daoimpl;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.model.RolUsuario;

public class RolUsuarioDaoImpl extends SessionFactoryImpl implements RolUsuarioDao {

  String ID_USUARIO = "usuario.idUsuario";
  private RolUsuario rolUsuario;

  @Override
  public boolean registrarRolUsuario(RolUsuario rolUsuario) {
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
  public RolUsuario obtenerDatoRolUsuario(String codUsuario) {
    Session session = getSessionFactory().openSession();
    session.beginTransaction();
    Criteria criteria = session.createCriteria(RolUsuario.class);
    criteria.add(Restrictions.eq(ID_USUARIO, Integer.parseInt(codUsuario)));
    rolUsuario = (RolUsuario) criteria.uniqueResult();
    session.close();
    return rolUsuario;
  }

}
