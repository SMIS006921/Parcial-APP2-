package com.example.actsemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class numeros extends AppCompatActivity {
    MediaPlayer uno;
    ImageView Uno;
    MediaPlayer dos;
    ImageView Dos;
    MediaPlayer tres;
    ImageView Tres;
    MediaPlayer cuatro;
    ImageView Cuatro;
    MediaPlayer cinco;
    ImageView Cinco;
    MediaPlayer seis;
    ImageView Seis;
    MediaPlayer siete;
    ImageView Siete;
    MediaPlayer ocho;
    ImageView Ocho;
    MediaPlayer nueve;
    ImageView Nueve;
    MediaPlayer diez;
    ImageView Diez;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);


        Uno = (ImageView) findViewById((R.id.Uno));
        uno = MediaPlayer.create(this, R.raw.
            unoaudio);
        Uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            uno.start();
            }
        });

        Dos = (ImageView) findViewById((R.id.Dos));
        dos = MediaPlayer.create(this, R.raw.
                dosaudio);
        Dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dos.start();
            }
        });

        Tres = (ImageView) findViewById((R.id.Tres));
        tres = MediaPlayer.create(this, R.raw.
                tresaudio);
        Tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tres.start();
            }
        });

        Cuatro = (ImageView) findViewById((R.id.Cuatro));
        cuatro = MediaPlayer.create(this, R.raw.
                cuatroaudio);
        Cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuatro.start();
            }
        });

        Cinco = (ImageView) findViewById((R.id.Cinco));
        cinco = MediaPlayer.create(this, R.raw.
                cincoaudio);
        Cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cinco.start();
            }
        });

        Seis = (ImageView) findViewById((R.id.Seis));
        seis = MediaPlayer.create(this, R.raw.
                seisaudio);
        Seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seis.start();
            }
        });

        Siete = (ImageView) findViewById((R.id.Siete));
        siete = MediaPlayer.create(this, R.raw.
                sieteaudio);
        Siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                siete.start();
            }
        });

        Ocho = (ImageView) findViewById((R.id.Ocho));
        ocho = MediaPlayer.create(this, R.raw.
                ochoaudio);
        Ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ocho.start();
            }
        });

        Nueve = (ImageView) findViewById((R.id.Nueve));
        nueve = MediaPlayer.create(this, R.raw.
                nueveaudio);
        Nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nueve.start();
            }
        });

        Diez = (ImageView) findViewById((R.id.Diezu));
        diez = MediaPlayer.create(this, R.raw.
                diezaudio);
        Diez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diez.start();
            }
        });
    }
public void info (View view) {
    Intent info = new Intent(this, Creditos.class);
    startActivity(info);
}
}