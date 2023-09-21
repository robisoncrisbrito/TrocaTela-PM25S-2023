package br.edu.utfpr.trocatela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class LancamentoActivity : AppCompatActivity() {

    private lateinit var etCod : EditText
    private lateinit var etQtd : EditText
    private lateinit var etValor : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lancamento)

        etCod = findViewById( )
    }

    fun btConfirmarOnClick(view: View) {

    }
    fun btListarOnClick(view: View) {

    }

}