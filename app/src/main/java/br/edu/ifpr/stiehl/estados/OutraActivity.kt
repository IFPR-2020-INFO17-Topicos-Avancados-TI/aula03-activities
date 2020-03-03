package br.edu.ifpr.stiehl.estados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_outra.*

class OutraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outra)

        val info = intent.extras?.getString("info")
        lInformacao.text = "Info: $info"
    }
}
