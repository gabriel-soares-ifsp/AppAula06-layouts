package com.example.exercicio02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtPeso;
    private EditText txtAltura;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPeso = findViewById(R.id.txtPeso);
        txtAltura = findViewById(R.id.txtAltura);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(e -> {
                double peso = Double.parseDouble(txtPeso.getText().toString());
                double altura = Double.parseDouble(txtAltura.getText().toString()) / 100;
                double imc = peso / (altura * altura);

                String resultado;

                if(imc < 18.5) {
                    resultado = "Abaixo do peso";
                } else {
                    if(imc < 25.0) {
                        resultado = "Peso normal";
                    } else {
                        if(imc < 30.0) {
                            resultado = "Acima do peso";
                        } else {
                            resultado = "Obeso";
                        }
                    }
                }

            Toast.makeText(MainActivity.this, resultado, Toast.LENGTH_SHORT).show();
        });
    }
}