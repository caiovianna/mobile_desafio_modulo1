package br.com.desafio1

import java.time.LocalDate
import java.time.Period
import java.util.*

class Titular(
        override var nome: String = "",
        override var sobrenome: String = "",
        override val codigoProf: Int = -1,
        var especialidade: String = ""): Professor(nome, sobrenome, codigoProf)
