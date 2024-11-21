import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCadastro = findViewById<Button>(R.id.btnCadastro)
        val btnMapa = findViewById<Button>(R.id.btnMapa)
        val btnContato = findViewById<Button>(R.id.btnContato)

        btnCadastro.setOnClickListener {
            startActivity(Intent(this, CadastroActivity::class.java))
        }

        btnMapa.setOnClickListener {
            startActivity(Intent(this, MapaActivity::class.java))
        }

        btnContato.setOnClickListener {
            startActivity(Intent(this, ContatoActivity::class.java))
        }
    }
}
