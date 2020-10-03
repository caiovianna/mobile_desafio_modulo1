package br.com.desafio1

class Aluno(
        var nome: String,
        var sobrenome: String,
        val codigoAluno: Int
) {

    override fun toString(): String {
        return "Aluna(o): $nome $sobrenome (Código: $codigoAluno)"
    }

}