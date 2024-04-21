package com.api.ApiRestInterface.repositories; // Declara el paquete en el que se encuentra la interfaz

import org.springframework.data.jpa.repository.JpaRepository; // Importa la interfaz JpaRepository de Spring Data JPA
import org.springframework.stereotype.Repository; // Importa la anotación Repository de Spring

import com.api.ApiRestInterface.models.UserModel; // Importa la clase UserModel

@Repository // Anotación que indica que esta interfaz es un componente de repositorio Spring
public interface IUserRepository extends JpaRepository<UserModel, Long> {
    // Extiende la interfaz JpaRepository para aprovechar las operaciones CRUD proporcionadas por Spring Data JPA
    // UserModel es la clase de la entidad con la que trabajará el repositorio
    // Long es el tipo de dato de la clave primaria de la entidad UserModel
}

