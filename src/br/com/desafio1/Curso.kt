package br.com.desafio1

class Curso(
        var nome: String,
        val codigoCurso: Int,
        var quantidadeMaximaDeAlunos: Int
)
{

    var listaAlunos = MutableList<Aluno>()
    var pTitular: Titular = Titular()
    var pAdjunto: Adjunto = Adjunto()


    fun adicionarUmAluno(): Boolean
    {
        var quantidadeAlunos: Int = (listaAlunos.count())
        when
        {
            quantidadeAlunos < quantidadeMaximaDeAlunos -> return true
            else -> return false
        }
    }

    fun excluirAluno(aln: Aluno)
    {
        listaAlunos.remove(aln)
    }


    override fun toString(): String
    {
        return "Curso: $nome - $codigoCurso"
    }

}