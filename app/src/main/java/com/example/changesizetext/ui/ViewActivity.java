package com.example.changesizetext.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.changesizetext.ChangeSizeApplication;
import com.example.changesizetext.data.model.Message;
import com.example.changesizetext.databinding.ActivityViewBinding;

/**
 * Clase empleada para recibir el mensaje, volver a mostrarlo y asignarle un tamaño.
 * @author Agustín Muñoz Jimenez
 * @version 1.0
 */

public class ViewActivity extends AppCompatActivity {

    static String TAG = "ChangeMessageProject";
    ActivityViewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //1. Recibimos el Intent.
        Intent mensajero = getIntent();
        //2. Guardamos el contenido del Intent en un Bundle.
        Bundle sobre = mensajero.getExtras();
        //3. Obtenemos los datos deseados del Bundle.
        Message tmp = (Message) sobre.getSerializable("Mensaje");
        //4. Realizamos las operaciones necesarias con dichos datos.
        binding.textView.setText(tmp.getMessage());
        binding.textView.setTextSize(tmp.getSize());
        Log.d(TAG, String.valueOf(((ChangeSizeApplication)getApplication()).getUser()));

    }
}