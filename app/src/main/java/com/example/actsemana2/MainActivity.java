package com.example.actsemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText txtNom;
    public TextView exitsaludo;
    public Button accion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNom = (EditText) findViewById(R.id.Nombre);
        accion = (Button) findViewById(R.id.Saludo);
        exitsaludo = (TextView) findViewById(R.id.exitsaludo);
    }
    public void tap(View view){
        String nombr = txtNom.getText().toString();
        exitsaludo.setText("Bienvenido " + nombr + "!");
    }

}