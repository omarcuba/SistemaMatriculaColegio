package dev.com.matricula.dao;

import java.util.List;

import dev.com.matricula.model.Usuariodocente;

public interface UsuarioDocenteDao {

  public boolean registrarUsuarioDocente(Usuariodocente usuarioDocente);

  public Integer obtenerUltimoIdUsuarioDocente();

  public List<Usuariodocente> obtenerUsuarioDocentes();

  public List<Usuariodocente> obtenerIdDocente(int codigoUsuario);

}
