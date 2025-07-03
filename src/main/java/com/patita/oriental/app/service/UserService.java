package com.patita.oriental.app.service;

import com.patita.oriental.app.model.User;


public interface UserService {

	/**
     * Recupera todos los usuarios de forma paginada.
     * @param pageable Configuración de paginación y ordenamiento.
     * @return Una página de usuarios.
     */
    Iterable<User> findAll();
    /**
     * Busca un usuario por su ID.
     * @param id El ID del usuario a buscar.
     * @return Contiene el usuario.
     */
    User findById(Long id);
    /**
     * Guarda un nuevo usuario 
     * @param role El usuario a guardar.
     * @return El usuario guardado.
     */
    User save(User user);
    
    /**
     * Actualiza un usuario existente.
     * @param id El id del usuario a actualizar
     * @param role El usuario a actualizar.
     * @return El usuario actualizado.
     */
    User update(Long id, User user);
    /**
     * Elimina un usuario por su ID.
     * @param id El ID del usuario a eliminar.
     */
    void deleteById(Long id);
    
    /**
     * Encuentra todos los usuarios que estan activos 
     * @return Colección de usuarios encontrados
     */
    Iterable<User> getActiveUsers();
}
