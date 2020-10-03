package br.com.desafio1

abstract class Professor(
        open var nome: String,
        open var sobrenome: String,
        open val codigoProf: Int
) {

    override fun toString(): String {
        return "Professor(a): $nome $sobrenome (Código: $codigoProf)"
    }

}