package com.example.changesizetext.data.model;

import java.io.Serializable;

/**
 * Clase que guarda la información del login de usuario.
 */
public class User implements Serializable {

    String Name;
    String Email;

    public User(String name, String email) {
        Name = name;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
