package dev.com.matricula.serviceimpl;

import java.util.List;

import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.daoimpl.UsuarioAlumnoDaoImpl;
import dev.com.matricula.daoimpl.UsuarioDaoImpl;
import dev.com.matricula.daoimpl.RolUsuarioDaoImpl;
import dev.com.matricula.model.Rolusuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.Usuarioalumno;
import dev.com.matricula.service.LoginService;

public class LoginServiceImpl implements LoginService {

  private UsuarioDao usuarioDao;
  private RolUsuarioDao rolUsuarioDao;
  private Usuario usuario;
  private Rolusuario rolUsuario;
  private UsuarioAlumnoDao usuarioAlumnoDao;

  @Override
  public Usuario obtenerDatoUsuarioAcceso(String login, String clave) {
    usuarioDao = new UsuarioDaoImpl();
    usuario = usuarioDao.obtenerDatoUsuarioAcceso(login, clave);
    return usuario;
  }

  @Override
  public Rolusuario obtenerDatoUsuarioRol(String idUsuario) {
    rolUsuarioDao = new RolUsuarioDaoImpl();
    rolUsuario = rolUsuarioDao.obtenerDatoRolUsuario(idUsuario);
    return rolUsuario;
  }

  @Override
  public List<Usuarioalumno> obtenerIdAlumno(int codigo) {
    usuarioAlumnoDao = new UsuarioAlumnoDaoImpl();
    return usuarioAlumnoDao.obtenerIdAlumno(codigo);
  }
}
