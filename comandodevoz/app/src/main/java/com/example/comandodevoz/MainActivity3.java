package com.example.comandodevoz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity3 extends AppCompatActivity implements TextToSpeech.OnInitListener {

    private TextToSpeech tts;
    private EditText etx;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);




        tts = new TextToSpeech(this,this);
        etx = findViewById(R.id.InputText);
        btn = findViewById(R.id.Hablarahora);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speakOut();
            }


        });
    }


    @Override
    public void onInit(int status) {
    if (status == TextToSpeech.SUCCESS){
        int resultado = tts.setLanguage(Locale.getDefault());
        if (resultado == TextToSpeech.LANG_NOT_SUPPORTED  || resultado == TextToSpeech.LANG_MISSING_DATA){
            Log.e("TTS","LENGUAJE NO SOPORTADO");

        }else{
            btn.setEnabled(true);
            speakOut();
        }
    }else{
     Log.e("TTS","INICIALIZACIÓN FALLIDA");
    }

    }

    private void speakOut() {

        String text = etx.getText().toString();
        tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

    }
}


