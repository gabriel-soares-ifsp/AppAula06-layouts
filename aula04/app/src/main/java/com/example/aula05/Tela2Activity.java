package com.example.aula05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Log.d("ciclo", getClassName() + ".onCreate() chamado");

        Intent intent = getIntent();

        //String nome = intent.getStringExtra("nome");
        //int idade = intent.getIntExtra("idade", -1);

        Pessoa pessoa = (Pessoa) intent.getSerializableExtra("pessoa");

        TextView lblTeste = findViewById(R.id.lblTeste);

        //lblTeste.setText("Nome: " + nome + ". Idade: " + idade);
        lblTeste.setText("Nome: " + pessoa.getNome() + ". Idade: " + pessoa.getIdade());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclo", getClassName() + ".onStart() chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo", getClassName() + ".onResume chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ciclo", getClassName() + ".onStop chamado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ciclo", getClassName() + ".onRestart chamado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ciclo", getClassName() + ".onDestroy chamado");
    }

    private String getClassName() {
        String nomeClasse = getClass().getName();
        return nomeClasse.substring(nomeClasse.lastIndexOf("."));
    }
}