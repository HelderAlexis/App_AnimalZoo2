package com.example.app_animalzoo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InicioSesionActivity extends AppCompatActivity {
    Button btn_Ingresar;
    Button btn_Registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
    }
    public void Ingresar(View v){
        Intent ingresar= new Intent(InicioSesionActivity.this, HomeActivity.class);
        startActivity(ingresar);
    }
    public void Registrarse(View v){
        Intent registrarse = new Intent(InicioSesionActivity.this,RegistrarseActivity.class);
        startActivity(registrarse);
    }
}