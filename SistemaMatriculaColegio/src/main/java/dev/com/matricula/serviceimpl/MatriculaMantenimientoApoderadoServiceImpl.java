package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.ApoderadoDao;
import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.model.Apoderado;
import dev.com.matricula.model.RolUsuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.UsuarioAlumno;
import dev.com.matricula.service.MatriculaMantenimientoApoderadoService;

public class MatriculaMantenimientoApoderadoServiceImpl implements MatriculaMantenimientoApoderadoService {

  private ApoderadoDao apoderadoDao;
  private UsuarioDao usuarioDao;
  private RolUsuarioDao rolUsuarioDao;
  private UsuarioAlumnoDao usuarioAlumnoDao;

  @Override
  public Integer buscarUltimoidApoderado() {
    return apoderadoDao.obtenerUltimoIdApoderado();
  }

  @Override
  public Integer buscarUltimoidUsuario() {
    return usuarioDao.obtenerUltimoIdUsuario();
  }

  @Override
  public Integer buscarUltimoidRolUsuario() {
    return rolUsuarioDao.obtenerUltimoIdRolUsuario();
  }

  @Override
  public Integer buscarUltimoidUsuarioAlumno() {
    return usuarioAlumnoDao.obtenerUltimoIdUsuarioAlumno();
  }

  @Override
  public boolean registrarApoderado(Apoderado apoderado) {
    return apoderadoDao.registrarApoderado(apoderado);
  }

  @Override
  public boolean registrarUsuario(Usuario usuario) {
    return usuarioDao.registrarUsuario(usuario);
  }

  @Override
  public boolean registrarRolUsuario(RolUsuario rolUsuario) {
    return rolUsuarioDao.registrarRolUsuario(rolUsuario);
  }

  @Override
  public boolean registrarUsuarioAlumno(UsuarioAlumno usuarioAlumno) {
    return usuarioAlumnoDao.registrarUsuarioAlumno(usuarioAlumno);
  }

  public void setApoderadoDao(ApoderadoDao apoderadoDao) {
    this.apoderadoDao = apoderadoDao;
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
