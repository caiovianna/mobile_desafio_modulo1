package br.com.desafio1

import java.time.LocalDate
import java.time.Period
import java.util.*

class Adjunto(override var nome: String = "", override var sobrenome: String = "", override val codigoProf: Int = -1, var horasMonitoria: Int = -1): Professor(nome, sobrenome, codigoProf) {

    val dataEntrada = LocalDate.now()
    var dataAtual = LocalDate.now()
    var tempoDeCasa = Period.between(dataEntrada, dataAtual)

}
