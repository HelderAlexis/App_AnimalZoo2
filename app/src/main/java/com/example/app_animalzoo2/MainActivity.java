package com.example.app_animalzoo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Para que la ventana tenga un tiempo y pase automatico
        TimerTask tarea= new TimerTask() {
            @Override
            public void run() {
            Intent intent=new Intent(MainActivity.this, InicioSesionActivity.class);
            startActivity(intent);
            finish();
            }
        };
        Timer tiempo= new Timer();
        tiempo.schedule(tarea,5000);
    }

}