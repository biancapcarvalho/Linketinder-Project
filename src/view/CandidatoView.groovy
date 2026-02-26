package view

import model.Candidato
import model.Competencia

class CandidatoView {
    void exibirListaDeCandidatos(List<Candidato> candidatos) {
        println "\n------------- LISTA DE CANDIDATOS ------------"
        if (!candidatos) {
            println "Nenhum candidato cadastrado"
            return
        }

        candidatos.each {exibirCandidato(it)}
    }

    void exibirCandidato(Candidato c) {
        String nome  = c.nome.toUpperCase()
        println "## $nome"
        println "  --> Idade: $c.idade, CPF: $c.cpf, E-mail: $c.email"
        println "  --> Estado: $c.estado, CEP: $c.cep"
        println "  --> Descrição: $c.descricao"
        print "  --> Competências: "
        exibirCompetencias(c.competencias)
            println "\n"
    }

    void exibirCompetencias(List<Competencia> competencias) {
        competencias.each { print "$it.nome "}
    }
}
