package br.com.unipac.protocolo.repositorio
import android.content.Context
import br.com.unipac.protocolo.model.Protocolo

class ProtocoloRepositorio(context: Context) {
    var protocolos: ArrayList<Protocolo>? = null
    fun salvar(protocolo: Protocolo) {
        protocolos?.add(protocolo)
    }
    fun listar(): List<Protocolo>? {
        return protocolos
    }
}