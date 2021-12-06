package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener{




    var tts: TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tts = TextToSpeech(this,this)

        findViewById<Button>(R.id.btnlose)
        findViewById<Button>(R.id.btnplay).setOnClickListener { speak() }





    }//fin onCreate

    private fun speak(){
        var message: String = findViewById<TextView>(R.id.etMessage).text.toString()


        if(message.isEmpty()){
            findViewById<TextView>(R.id.tvStatus).text = "INTRODUCE UN TEXTO"
            message = "POR FAVOR INTRODUCE UN TEXTO"
            //Toast.makeText(this,"poner un texto",Toast.LENGTH_LONG).show()
        }

        tts!!.speak(message,TextToSpeech.QUEUE_FLUSH,null,"")
    }

    override fun onInit(status: Int) {

        if (status == TextToSpeech.SUCCESS){
            findViewById<TextView>(R.id.tvStatus).text = "LISTO"
            tts!!.setLanguage(Locale("ES"))
        }else{
            findViewById<TextView>(R.id.tvStatus).text = "NO DISPOSIBLE"
        }

    }

    override fun onDestroy() {
        if (tts != null) {
            tts!!.stop()
            tts!!.shutdown()
        }
        super.onDestroy()
    }


}//fin MainActivity