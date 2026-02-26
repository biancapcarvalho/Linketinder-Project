package controller

import model.Candidato
import model.CandidatoList
import model.CompetenciaList
import view.CandidatoView

class CandidatoController {
    CandidatoView view
    CandidatoList list

    void listarCandidatos() {
        view.exibirListaDeCandidatos(list.candidatos)
    }

    def criarCandidato() {
        def input = view.criarCandidato()
        Candidato candidato = new Candidato()
        candidato.nome = input.nome
        candidato.idade = input.idade
        candidato.cpf = input.cpf
        candidato.email = input.email
        candidato.estado = input.estado
        candidato.cep = input.cep
        candidato.descricao = input.descricao
        candidato.competencias = (new CompetenciaList()).getCompetencias(input.competencias) // isso funciona enquanto é fixa a lista de competencias

        list.candidatos.add(candidato)

        return candidato
    }

    void exibirNovoCandidato(Candidato candidato) {
        println "\n----------- CANDIDATO CRIADO COM SUCESSO -----------"
        view.exibirCandidato(candidato)
    }
}
