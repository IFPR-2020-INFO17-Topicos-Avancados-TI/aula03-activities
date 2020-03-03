package br.edu.ifpr.stiehl.estados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btAbrir.setOnClickListener {
            val info = txtInformacao.text.toString()
            val bundle = Bundle()
            bundle.putString("info", info)
            val intent = Intent(this, OutraActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        Log.i("MinhaTela", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MinhaTela", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MinhaTela", "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MinhaTela", "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MinhaTela", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MinhaTela", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MinhaTela", "onDestroy")
    }
}
