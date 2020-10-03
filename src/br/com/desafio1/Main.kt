package br.com.desafio1

fun main() {

    var admin = DigitalHouseManager()

    admin.registrarProfessorTitular("Caio", "Vianna", 1, "Kotlin")
    admin.registrarProfessorTitular("João", "Vitória", 2, "Scrum")
    admin.registrarProfessorAdjunto("Maria", "Luiza", 3, 4)
    admin.registrarProfessorAdjunto("Carlos", "Paiva", 4, 2)

    admin.registrarCurso("Full Stack",20001, 3)
    admin.registrarCurso("Android",20002, 2)

    admin.alocarProfessor(20001, 1, 3)
    admin.alocarProfessor(20002, 2, 4)

    admin.registrarAluno("Ademisse", "Vianna", 1)
    admin.registrarAluno("Adilson", "Vieira", 2)
    admin.registrarAluno("Alessandra", "Machado", 3)
    admin.registrarAluno("Anna", "Karolina", 4)
    admin.registrarAluno("Júlia", "Vianna",5)

    admin.matricularAluno(1, 20001)
    admin.matricularAluno(2, 20001)

    admin.matricularAluno(3, 20002)
    admin.matricularAluno(1, 20002)
    admin.matricularAluno(5, 20002)

}