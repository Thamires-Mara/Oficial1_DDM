package com.example.tela_inicial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora_de_Conversao extends AppCompatActivity {

    Button temperatura = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_de__conversao);
        temperatura = (Button)findViewById(R.id.button2);
         temperatura.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent cam = new Intent(getApplicationContext(), Temperatura.class);
                 startActivity(cam);
             }
         });

    }
}