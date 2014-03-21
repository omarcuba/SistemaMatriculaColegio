package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

  private UsuarioDao usuarioDao;

  private RolUsuarioDao rolUsuarioDao;

  @Override
  public boolean registrarUsuario(Usuario usuarioP) {
    boolean rspt = usuarioDao.registrarUsuario(usuarioP);
    return rspt;
  }

  @Override
  public boolean registrarAccesoRol(RolUsuario rolUsuarioP) {
    boolean rspt = rolUsuarioDao.registrarRolUsuario(rolUsuarioP);
    return rspt;
  }

  @Override
  public Integer buscarUltimoidRolUsuario() {
    return rolUsuarioDao.obtenerUltimoIdRolUsuario();
  }

  @Override
  public Integer buscarUltimoidUsuario() {
    return usuarioDao.obtenerUltimoIdUsuario();
  }

  public void setUsuarioDao(UsuarioDao usuarioDao) {
    this.usuarioDao = usuarioDao;
  }

  public void setRolUsuarioDao(RolUsuarioDao rolUsuarioDao) {
    this.rolUsuarioDao = rolUsuarioDao;
  }

}
