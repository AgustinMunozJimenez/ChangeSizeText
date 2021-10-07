package com.example.changesizetext.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.changesizetext.ChangeSizeApplication;
import com.example.changesizetext.data.model.Message;
import com.example.changesizetext.databinding.ActivityConfigsizetextBinding;

/**
 * Clase en la cual generamos un mensaje, le asignamos un tamaño y lo enviamos a otra Activity
 * mediante un Intent.
 * @author Agustín Muñoz Jimenez
 * @version 1.0
 */
public class ConfigSizeTextActivity extends AppCompatActivity {
    private static final String TAG = "ChangeSizeTextProject";
    private ActivityConfigsizetextBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityConfigsizetextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnSend.setOnClickListener(view -> {
            //1.Crear Objeto Bundle
            Bundle bundle=new Bundle();
            //2. Añadir Mensaje al Bundle. Añadimos el usuario mediante la función getUser de la
            //clase ChangeSizeTextApplication.
            Message mensaje=new Message(((ChangeSizeApplication)getApplication()).getUser(),binding.txtMessage.getText().toString(),binding.skSize.getProgress());
            bundle.putSerializable("Mensaje",mensaje);
            //3.Enviar Intent
            Intent intent=new Intent(this,ViewActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ChangeSIzeTextActivity -> OnDestroy()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ChangeSIzeTextActivity -> OnStop()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ChangeSIzeTextActivity -> OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ChangeSIzeTextActivity -> OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ChangeSIzeTextActivity -> OnPause()");
    }
}