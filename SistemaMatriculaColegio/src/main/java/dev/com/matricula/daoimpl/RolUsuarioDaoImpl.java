package dev.com.matricula.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.model.RolUsuario;

public class RolUsuarioDaoImpl extends AbstractHibernateDao implements RolUsuarioDao {

  private Session session;
  private Criteria criteria;
  private Query query;
  private int entero;
  private String CODIGO_USUARIO = "usuario.idUsuario";
  private RolUsuario rolUsuario;
  private List<RolUsuario> rolUsuarioList;

  @Override
  public boolean registrarRolUsuario(RolUsuario rolUsuario) {
    try {
      session = getSessionFactory().openSession();
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
    session = getSessionFactory().openSession();
    query = session.createSQLQuery("select max(idrolusuario+1) from RolUsuario");
    entero = Integer.parseInt(query.uniqueResult().toString());
    session.close();
    return entero;
  }

  @Override
  public RolUsuario obtenerDatoRolUsuario(int codigoUsuario) {
    session = getSessionFactory().openSession();
    session.beginTransaction();
    criteria = session.createCriteria(RolUsuario.class);
    criteria.add(Restrictions.eq(CODIGO_USUARIO, codigoUsuario));
    rolUsuario = (RolUsuario) criteria.uniqueResult();
    session.close();
    return rolUsuario;
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<RolUsuario> obtenerRolusuarios() {
    session = getSessionFactory().openSession();
    criteria = session.createCriteria(RolUsuario.class);
    rolUsuarioList = criteria.list();
    session.close();
    return rolUsuarioList;
  }

}
