package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.dao.UsuarioRolDao;
import dev.com.matricula.daoimpl.UsuarioDaoImpl;
import dev.com.matricula.daoimpl.UsuarioRolDaoImpl;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.LoginService;

public class LoginServiceImpl implements LoginService {

  private UsuarioDao usuarioDao;
  private UsuarioRolDao usuarioRolDao;
  private Usuario usuario;
  private RolUsuario rolUsuario;

  @Override
  public Usuario obtenerDatoUsuarioAcceso(String login, String clave) {
    usuarioDao = new UsuarioDaoImpl();
    usuario = usuarioDao.obtenerDatoUsuarioAcceso(login, clave);
    return usuario;
  }

  @Override
  public RolUsuario obtenerDatoUsuarioRol(String idUsuario) {
    usuarioRolDao = new UsuarioRolDaoImpl();
    rolUsuario = usuarioRolDao.obtenerDatoUsuarioRol(idUsuario);
    return rolUsuario;
  }

}
