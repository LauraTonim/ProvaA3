package br.com.unipac.protocolo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import br.com.unipac.protocolo.model.Protocolo
import br.com.unipac.protocolo.repositorio.ProtocoloRepositorio

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nomeProtocoloEdt = findViewById<EditText>(R.id.nomeProtocoloEdt)
        var emailProtocoloEdt =findViewById<EditText>(R.id.emailProtocoloEdt)
        var numeroProtocoloEdt =findViewById<EditText>(R.id.numeroProtocoloEdt)
        var btnSalvar = findViewById<Button>(R.id.btnSalvar)

        var protocoloRepositorio = ProtocoloRepositorio(this)
        btnSalvar.setOnClickListener {
            var nomeProtocoloEdt = nomeProtocoloEdt.text.toString()
            var emailProtocoloEdt = emailProtocoloEdt.text.toString()
            var numeroProtocoloEdt = numeroProtocoloEdt.text.toString()
            var protocolo = Protocolo(1, nomeProtocoloEdt, emailProtocoloEdt,
            numeroProtocoloEdt.toInt())
            protocoloRepositorio.salvar(protocolo)
        }
    }
}