package dev.com.matricula.daobase;

public interface BaseDao<E> {

  /**
   * Inserta un registro de la entidad en la Base de Datos
   * 
   * @param e entidad a insertar
   * @return true si se completo la operacion, false en otro caso.
   */
  boolean insertar(E entidad);

  /**
   * Actualiza la entidad en la Base de Datos
   * 
   * @param entidad a actualizar
   * @return true si se completo la operacion, false en otro caso.
   */
  boolean actualizar(E entidad);

  /**
   * Remueve la entidad de la Base de Datos (Preferible borrado logico que el
   * fisico)
   * 
   * @param e entidad a remover
   * @return true si se completo la operacion, false en otro caso.
   */
  boolean remover(E entidad);

}
