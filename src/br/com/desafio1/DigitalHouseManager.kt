package br.com.desafio1

import br.com.digitalhouse.desafio.Matricula
import java.time.LocalDate

class DigitalHouseManager() {
    var listaAlunos = mutableMapOf<Int, Aluno>()
    var listaProfessores = mutableMapOf<Int, Professor>()
    var listaCursos = mutableMapOf<Int, Curso>()
    var listaMatriculas = mutableMapOf<Matricula, Int>()

    fun registrarCurso(nome: String, codigoCur: Int, quantidadeMaximaDeAlunos: Int) {

        val curso = Curso(nome, codigoCur, quantidadeMaximaDeAlunos)
        listaCursos.put(codigoCur, curso)

    }

    fun excluirCurso(codigoCurso: Int) {

        listaCursos.remove(codigoCurso)

    }

    fun registrarProfessorAdjunto(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            quantidadeDeHoras:Int)
    {

        val pAdjunto = Adjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras)
        listaProfessores.put(codigoProfessor, pAdjunto)

    }

    fun registrarProfessorTitular(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            especialidade: String)
    {

        val profTitular = Titular(nome, sobrenome, codigoProfessor, especialidade)
        listaProfessores.put(codigoProfessor, profTitular)

    }

    fun excluirProfessor(
            codigoProfessor: Int)
    {

        listaProfessores.remove(codigoProfessor)

    }

    fun registrarAluno(
            nome: String,
            sobrenome: String,
            codigoAluno: Int)
    {

        val aluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.put(codigoAluno, aluno)

    }

    fun matricularAluno(
            codigoAluno: Int,
            codigoCurso: Int)
    {

        val aluno = listaAlunos[codigoAluno]
        val curso = listaCursos[codigoCurso]
        var matricula = Matricula(aluno, curso)
        var verificar = curso?.adicionarUmAluno()
        when {
            verificar!! -> {
                listaMatriculas.put(matricula, codigoAluno)
                if (aluno != null) {
                    curso?.listaAlunos?.add(aluno)
                }
                println ("Matrícula realizada com sucesso.")
            }
            else -> {
                println("Não foi possível realizar matrícula. Vagas indisponíveis.")
            }
        }

    }

    fun alocarProfessor(
            codigoCurso: Int,
            codigoProfessorTitular: Int,
            codigoProfessorAdjunto: Int)
    {

        val professorTitular = listaProfessores[codigoProfessorTitular]
        val professorAdjunto = listaProfessores[codigoProfessorAdjunto]
        val curso = listaCursos[codigoCurso]
        if (curso != null) {
            curso.pTitular = professorTitular as Titular
        }
        if (curso != null) {
            curso.pAdjunto = professorAdjunto as Adjunto
        }

    }

    fun consultarAlunosCurso(codigoCurso: Int) {
        var curso = listaCursos[codigoCurso]
        println(curso?.listaAlunos)
    }

    fun consultarProfessoresCurso(codigoCurso: Int) {
        var curso = listaCursos[codigoCurso]
        print(curso?.pTitular)
        print(" e ")
        println(curso?.pAdjunto)
    }

    fun consultarMatriculaAluno(codigoAluno: Int) {
        for ((key, value) in listaMatriculas) {
            if (codigoAluno == value) {
                println(key)
            }
        }
    }

}