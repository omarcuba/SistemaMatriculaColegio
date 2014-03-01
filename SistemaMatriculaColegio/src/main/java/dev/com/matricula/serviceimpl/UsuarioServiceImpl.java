package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.daoimpl.UsuarioDaoImpl;
import dev.com.matricula.daoimpl.RolUsuarioDaoImpl;
import dev.com.matricula.model.Rolusuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

  private UsuarioDao usuarioDao;
  private RolUsuarioDao rolUsuarioDao;

  @Override
  public boolean registrarUsuario(Usuario usuarioP) {
    usuarioDao = new UsuarioDaoImpl();
    boolean rspt = usuarioDao.registrarUsuario(usuarioP);
    return rspt;
  }

  @Override
  public boolean registrarAccesoRol(Rolusuario rolUsuarioP) {
    rolUsuarioDao = new RolUsuarioDaoImpl();
    boolean rspt = rolUsuarioDao.registrarRolUsuario(rolUsuarioP);
    return rspt;
  }

  @Override
  public Integer buscarUltimoidRolUsuario() {
    rolUsuarioDao = new RolUsuarioDaoImpl();
    return rolUsuarioDao.obtenerUltimoIdRolUsuario();
  }

  @Override
  public Integer buscarUltimoidUsuario() {
    usuarioDao = new UsuarioDaoImpl();
    return usuarioDao.obtenerUltimoIdUsuario();
  }

}
