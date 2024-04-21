package com.api.ApiRestInterface.models; // Declara el paquete en el que se encuentra la clase

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Indica que esta clase es una entidad JPA y se puede mapear a una tabla en la base de datos
@Table(name="user") // Especifica el nombre de la tabla en la base de datos
public class UserModel {

    @Id // Indica que este campo es la clave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera automáticamente valores para la clave primaria
    private long id; 

    @Column // Indica que este campo Son columnas  de la tabla
    private String Username; 

    @Column 
    private String Email;

    @Column 
    private String Password;

    @Column 
    private Long Id_rol;

    // Getters y Setters para acceder y modificar los campos privados

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Long getId_rol() {
        return Id_rol;
    }

    public void setId_rol(Long id_rol) {
        Id_rol = id_rol;
    }
    
}
