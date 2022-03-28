package com.example.aula05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnClicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("ciclo", getClassName() + ".onCreate() chamado");

        btnClicar = findViewById(R.id.btnClicar);

        btnClicar.setOnClickListener(e -> {

            Intent intent = new Intent(getBaseContext(), Tela2Activity.class);
            intent.putExtra("nome", "Gabriel");
            intent.putExtra("idade", 20);

            Pessoa pessoa = new Pessoa("Gabriel", 20);

            intent.putExtra("pessoa", pessoa);

            startActivity(intent);
        });
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