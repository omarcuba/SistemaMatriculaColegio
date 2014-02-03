package dev.com.matricula.daoimpl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dev.com.matricula.dao.UsuarioRolDao;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.util.HibernateUtil;

public class UsuarioRolDaoImpl implements UsuarioRolDao {

  String IDUSU = "usuario.idUsuario";
  private RolUsuario rolUsuario;

  @Override
  public RolUsuario obtenerDatoUsuarioRol(String codUsuario) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    Criteria criteria = session.createCriteria(RolUsuario.class);
    criteria.add(Restrictions.eq(IDUSU, Integer.parseInt(codUsuario)));
    rolUsuario = (RolUsuario) criteria.uniqueResult();
    session.close();
    return rolUsuario;
  }

}
