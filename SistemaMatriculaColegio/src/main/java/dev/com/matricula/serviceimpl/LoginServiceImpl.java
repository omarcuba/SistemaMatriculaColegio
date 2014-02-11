package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.daoimpl.UsuarioDaoImpl;
import dev.com.matricula.daoimpl.RolUsuarioDaoImpl;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.LoginService;

public class LoginServiceImpl implements LoginService {

  private UsuarioDao usuarioDao;
  private RolUsuarioDao rolUsuarioDao;
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
    rolUsuarioDao = new RolUsuarioDaoImpl();
    rolUsuario = rolUsuarioDao.obtenerDatoRolUsuario(idUsuario);
    return rolUsuario;
  }

}
