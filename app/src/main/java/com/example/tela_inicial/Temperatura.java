package com.example.tela_inicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Temperatura extends AppCompatActivity {

    EditText user = null;
    Button conver = null;
    Spinner spn = null;
    TextView resultado = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        conver = (Button) findViewById(R.id.btn_tem);
        user = (EditText) findViewById(R.id.temp);
        spn = (Spinner) findViewById(R.id.spinner_);
        resultado = (TextView) findViewById(R.id.result);

        String [] op = {"Selecione uma opção" , "°C para ° F" , "°F para °C"};
        ArrayAdapter <String> adapter = new
                ArrayAdapter<String>(this, android. R.layout. simple_spinner_item, op);
        spn.setAdapter(adapter);

        conver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (user.getText().toString().equals(" ")){
                    Toast msg = Toast.makeText(getApplicationContext(), " Informe a temperatura", Toast.LENGTH_SHORT);
                    msg.show();
                }else{
                    Double c = Double.parseDouble(user.getText().toString());
                    Double res = null;
                    int select = spn.getSelectedItemPosition();

                    switch (select) {

                        case 0 :
                            res = 0.0;
                            Toast.makeText(getApplicationContext() , "Selecione uma opção", Toast.LENGTH_SHORT).show();
                            break;

                        case 1:
                            res=1.8 *c +32;
                            break;

                        case 2:
                            res = (c -32) / 1.8;
                            break;
                    }
                    resultado.setText(res.toString());
                }
            }
        });
    }
}