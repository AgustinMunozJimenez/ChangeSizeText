package com.example.changesizetext;

import android.app.Application;

import com.example.changesizetext.data.model.User;

import java.io.Serializable;

/**
 * Clase creada para generar un usuario y que sea común para todas las Activitys.
 * @author Agustín Muñoz Jimenez
 * @version 1.0
 */
public class ChangeSizeApplication extends Application implements Serializable {
    User Usuario;
    @Override
    public void onCreate() {
        super.onCreate();
        Usuario = new User("Agustin","al.agustin.munoz.jimenez@gmail.com");
    }

    public User getUser() {
        return Usuario;
    }
}
