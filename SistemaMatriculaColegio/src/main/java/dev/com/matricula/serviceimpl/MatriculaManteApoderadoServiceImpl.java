package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.ApoderadoDao;
import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.daoimpl.ApoderadoDaoImpl;
import dev.com.matricula.daoimpl.RolUsuarioDaoImpl;
import dev.com.matricula.daoimpl.UsuarioAlumnoDaoImpl;
import dev.com.matricula.daoimpl.UsuarioDaoImpl;
import dev.com.matricula.model.Apoderado;
import dev.com.matricula.model.Rolusuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.Usuarioalumno;
import dev.com.matricula.service.MatriculaManteApoderadoService;

public class MatriculaManteApoderadoServiceImpl implements MatriculaManteApoderadoService {

  private ApoderadoDao apoderadoDao;
  private UsuarioDao usuarioDao;
  private RolUsuarioDao rolUsuarioDao;
  private UsuarioAlumnoDao usuarioAlumnoDao;

  @Override
  public Integer buscarUltimoidApoderado() {
    apoderadoDao = new ApoderadoDaoImpl();
    return apoderadoDao.obtenerUltimoIdApoderado();
  }

  @Override
  public Integer buscarUltimoidUsuario() {
    usuarioDao = new UsuarioDaoImpl();
    return usuarioDao.obtenerUltimoIdUsuario();
  }

  @Override
  public Integer buscarUltimoidRolUsuario() {
    rolUsuarioDao = new RolUsuarioDaoImpl();
    return rolUsuarioDao.obtenerUltimoIdRolUsuario();
  }

  @Override
  public Integer buscarUltimoidUsuarioAlumno() {
    usuarioAlumnoDao = new UsuarioAlumnoDaoImpl();
    return usuarioAlumnoDao.obtenerUltimoIdUsuarioAlumno();
  }

  @Override
  public boolean registrarApoderado(Apoderado apoderado) {
    apoderadoDao = new ApoderadoDaoImpl();
    return apoderadoDao.registrarApoderado(apoderado);
  }

  @Override
  public boolean registrarUsuario(Usuario usuario) {
    usuarioDao = new UsuarioDaoImpl();
    return usuarioDao.registrarUsuario(usuario);
  }

  @Override
  public boolean registrarRolUsuario(Rolusuario rolUsuario) {
    rolUsuarioDao = new RolUsuarioDaoImpl();
    return rolUsuarioDao.registrarRolUsuario(rolUsuario);
  }

  @Override
  public boolean registrarUsuarioAlumno(Usuarioalumno usuarioAlumno) {
    usuarioAlumnoDao = new UsuarioAlumnoDaoImpl();
    return usuarioAlumnoDao.registrarUsuarioAlumno(usuarioAlumno);
  }
}
