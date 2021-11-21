package com.example.comandodevoz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ComandoVoz;
    Button ComandoPorEscrito;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ComandoVoz        = findViewById(R.id.ComandoVoz);
        ComandoPorEscrito = findViewById(R.id.ComandoPorEscrito);


        ComandoVoz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(a);
            }
        });

        ComandoPorEscrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(a);
            }
        });

    }
}