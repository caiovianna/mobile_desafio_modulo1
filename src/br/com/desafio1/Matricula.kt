package br.com.digitalhouse.desafio

import br.com.desafio1.Aluno
import br.com.desafio1.Curso
import java.util.*

class Matricula(
        var aluno: Aluno,
        var curso: Curso
) {

    var data = Date()

    override fun toString(): String {
        return "$aluno $curso"
    }

}