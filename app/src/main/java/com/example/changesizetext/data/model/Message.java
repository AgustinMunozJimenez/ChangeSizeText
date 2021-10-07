package com.example.changesizetext.data.model;

import java.io.Serializable;

/**
 * Clase que guarda un mensaje de un usuario que ha iniciado Sesión.
 */
public class Message implements Serializable {
    User Usuario;
    String Message;
    int Size;

    public Message(User usuario, String message, int size) {
        Usuario = usuario;
        Message = message;
        Size = size;
    }

    public User getUsuario() {
        return Usuario;
    }

    public void setUsuario(User usuario) {
        Usuario = usuario;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    @Override
    public String toString() {
        return "Message{" +
                "Usuario=" + Usuario +
                ", Message='" + Message + '\'' +
                ", Size=" + Size +
                '}';
    }
}
