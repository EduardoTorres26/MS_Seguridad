package com.api.ApiRestInterface.Controllers; // Declara el paquete en el que se encuentra la clase

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired; // Importa la anotación @Autowired de Spring
import org.springframework.web.bind.annotation.DeleteMapping; // Importa anotaciones para mapeo de URL
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ApiRestInterface.models.UserModel; // Importa la clase UserModel
import com.api.ApiRestInterface.services.UserService; // Importa el servicio UserService

@RestController // Anotación que indica que esta clase es un controlador REST
@RequestMapping("/User") // Mapea las solicitudes que comienzan con /User a este controlador
public class UserController {

    @Autowired // Inyecta una instancia de UserService en este controlador
    private UserService userService;

    @GetMapping // Mapea las solicitudes GET a este método
    public ArrayList<UserModel> getUsers() {
        // Obtiene todos los usuarios a través del servicio UserService
        return this.userService.getUsers();
    }

    @PostMapping // Mapea las solicitudes POST a este método
    public UserModel saveUser(@RequestBody UserModel user) {
        // Guarda un nuevo usuario a través del servicio UserService
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}") // Mapea las solicitudes GET con una variable de ruta para el ID
    public Optional<UserModel> getUserById(@PathVariable("id") long id) {
        // Obtiene un usuario por su ID a través del servicio UserService
        return this.userService.GetById(id);
    }

    @PutMapping(path = "/{id}") // Mapea las solicitudes PUT con una variable de ruta para el ID
    public UserModel updateUserById(@RequestBody UserModel request, @PathVariable("id") Long id) {
        // Actualiza un usuario por su ID a través del servicio UserService
        return this.userService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}") // Mapea las solicitudes DELETE con una variable de ruta para el ID
    public String deleteById(@PathVariable("id") Long id) {
        // Elimina un usuario por su ID a través del servicio UserService
        Boolean ok = this.userService.deleteUser(id);
        if (ok) {
            return "User with id " + id + " deleted!";
        } else {
            return "Error, we have a problem and cannot delete the user with id " + id;
        }
    }

}
