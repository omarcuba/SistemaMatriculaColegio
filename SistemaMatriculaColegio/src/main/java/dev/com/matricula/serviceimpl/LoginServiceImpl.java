package dev.com.matricula.serviceimpl;

import java.util.List;

import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.UsuarioAlumno;
import dev.com.matricula.service.LoginService;

public class LoginServiceImpl implements LoginService {

  private UsuarioDao usuarioDao;
  private RolUsuarioDao rolUsuarioDao;
  private Usuario usuario;
  private RolUsuario rolUsuario;
  private UsuarioAlumnoDao usuarioAlumnoDao;

  @Override
  public Usuario obtenerDatoUsuarioAcceso(String login, String clave) {
    usuario = usuarioDao.obtenerDatoUsuarioAcceso(login, clave);
    return usuario;
  }

  @Override
  public RolUsuario obtenerDatoUsuarioRol(int idUsuario) {
    rolUsuario = rolUsuarioDao.obtenerDatoRolUsuario(idUsuario);
    return rolUsuario;
  }

  @Override
  public List<UsuarioAlumno> obtenerIdAlumno(int codigoUsuario) {
    return usuarioAlumnoDao.obtenerIdAlumno(codigoUsuario);
  }

  public void setUsuarioDao(UsuarioDao usuarioDao) {
    this.usuarioDao = usuarioDao;
  }

  public void setRolUsuarioDao(RolUsuarioDao rolUsuarioDao) {
    this.rolUsuarioDao = rolUsuarioDao;
  }

  public void setUsuarioAlumnoDao(UsuarioAlumnoDao usuarioAlumnoDao) {
    this.usuarioAlumnoDao = usuarioAlumnoDao;
  }
}
