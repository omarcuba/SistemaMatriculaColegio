package dev.com.matricula.daoimpl;

import java.util.List;

import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.model.Usuarioalumno;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class UsuarioAlumnoDaoImpl extends SessionFactoryImpl implements UsuarioAlumnoDao {

  private String CODIGO = "idUsuario";
  private List<Usuarioalumno> lista;

  @SuppressWarnings("unchecked")
  @Override
  public List<Usuarioalumno> obtenerIdAlumno(int codigo) {
    Session session = getSessionFactory().openSession();
    session.beginTransaction();
    Criteria criteria = session.createCriteria(Usuarioalumno.class);
    criteria.add(Restrictions.eq(CODIGO, codigo));
    lista = criteria.list();
    session.close();
    return lista;
  }

}
