package br.edu.utfpr.trocatela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class ConfirmarActivity : AppCompatActivity() {

    private lateinit var etCodConfirmar : EditText
    private lateinit var etQtdConfirmar : EditText
    private lateinit var etValorConfirmar : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar)

        etCodConfirmar = findViewById( R.id.etCodConfirmar )
        etQtdConfirmar = findViewById( R.id.etQtdConfirmar )
        etValorConfirmar = findViewById( R.id.etValorConfirmar )

        etCodConfirmar.setText( intent.getStringExtra( "cod" ) )
        etQtdConfirmar.setText( intent.getStringExtra( "qtd" ) )
        etValorConfirmar.setText( intent.getStringExtra( "valor" ) )

    }

    fun btConfirmarOnClick(view: View) {

    }
}