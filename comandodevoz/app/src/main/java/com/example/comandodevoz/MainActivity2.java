package com.example.comandodevoz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {

    private Button pasar;
    private static final int REC_CODE_SPEECH_INPUT = 100;
    private TextView mEntradaVoz;
    private ImageButton mBotonHablar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mEntradaVoz = findViewById(R.id.textoentrada);
        mBotonHablar = findViewById(R.id.botonhablar);



        //este codigo es para que cuando se pulse el boton de hablar, se pueda hablar, y de esta manera dicho texto aparezca en el TextView (mEntradaVoz)
        mBotonHablar.setOnClickListener(v -> iniciarEntradaVoz());
    }
    private void iniciarEntradaVoz() {
        Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        i.putExtra(RecognizerIntent.EXTRA_PROMPT,"HOLA, DI ALGO");
        try {
            startActivityForResult(i,REC_CODE_SPEECH_INPUT);
        }catch (ActivityNotFoundException e){

        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode ){
            case REC_CODE_SPEECH_INPUT:{
                if (resultCode == RESULT_OK && null != data){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    mEntradaVoz.setText(result.get(0));
                }
                break;
            }
        }

    }
}