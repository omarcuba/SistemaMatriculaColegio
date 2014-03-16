package dev.com.matricula.serviceimpl;

import dev.com.matricula.dao.AlumnoDao;
import dev.com.matricula.dao.RolUsuarioDao;
import dev.com.matricula.dao.UsuarioAlumnoDao;
import dev.com.matricula.dao.UsuarioDao;
import dev.com.matricula.daoimpl.AlumnoDaoImpl;
import dev.com.matricula.daoimpl.RolUsuarioDaoImpl;
import dev.com.matricula.daoimpl.UsuarioAlumnoDaoImpl;
import dev.com.matricula.daoimpl.UsuarioDaoImpl;
import dev.com.matricula.model.Alumno;
import dev.com.matricula.model.Rolusuario;
import dev.com.matricula.model.Usuario;
import dev.com.matricula.model.Usuarioalumno;
import dev.com.matricula.service.MatriculaManteAlumnoService;

public class MatriculaManteAlumnoServiceImpl implements MatriculaManteAlumnoService {

  private AlumnoDao alumnoDao;
  private UsuarioDao usuarioDao;
  private RolUsuarioDao rolUsuarioDao;
  private UsuarioAlumnoDao usuarioAlumnoDao;

  @Override
  public Integer buscarUltimoidAlumno() {
    alumnoDao = new AlumnoDaoImpl();
    return alumnoDao.obtenerUltimoIdAlumno();
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
  public boolean registrarAlumno(Alumno alumno) {
    alumnoDao = new AlumnoDaoImpl();
    return alumnoDao.registrarAlumno(alumno);
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