package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.daoimpl.UsuarioDaoImpl;
import dev.com.matricula.daoimpl.RolUsuarioDaoImpl;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

  private UsuarioDao usuarioDao;
  private RolUsuarioDao rolUsuarioDao;

  @Override
  public boolean registrarUsuario(Usuario usuarioP) {
    usuarioDao = new UsuarioDaoImpl();
    boolean rspt = usuarioDao.insertarUsuario(usuarioP);
    return rspt;
  }

  @Override
  public boolean registrarAccesoRol(RolUsuario rolUsuarioP) {
    rolUsuarioDao = new RolUsuarioDaoImpl();
    boolean rspt = rolUsuarioDao.insertarRolUsuario(rolUsuarioP);
    return rspt;
  }

  @Override
  public String BuscarUltimoidRolUsuario() {
    rolUsuarioDao = new RolUsuarioDaoImpl();
    String Codigo = rolUsuarioDao.obtenerUltimoIdRolUsuario();
    return Codigo;
  }

  @Override
  public String BuscarUltimoidUsuario() {
    usuarioDao = new UsuarioDaoImpl();
    String Codigo = usuarioDao.obtenerUltimoIdUsuario();
    return Codigo;
  }

}
