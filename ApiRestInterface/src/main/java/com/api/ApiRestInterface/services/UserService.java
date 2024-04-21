package com.api.ApiRestInterface.services; // Declara el paquete en el que se encuentra la clase

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired; // Importa la anotación @Autowired de Spring
import org.springframework.stereotype.Service; // Importa la anotación Service de Spring

import com.api.ApiRestInterface.models.UserModel; // Importa la clase UserModel
import com.api.ApiRestInterface.repositories.IUserRepository; // Importa la interfaz IUserRepository

@Service // Anotación que indica que esta clase es un componente de servicio de Spring
public class UserService {

    @Autowired // Inyecta una instancia de IUserRepository en este servicio
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers() {
        // Obtiene todos los usuarios del repositorio
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user) {
        // Guarda un nuevo usuario en el repositorio
        return userRepository.save(user);
    }

    public Optional<UserModel> GetById(Long id) {
        // Obtiene un usuario por su ID del repositorio
        return userRepository.findById(id);
    }

    public UserModel updateById(UserModel request, Long id) {
        // Actualiza un usuario por su ID en el repositorio
        UserModel user = userRepository.findById(id).get();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        return user;
    }

    public boolean deleteUser(Long id) {
        // Elimina un usuario por su ID del repositorio
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

