package controller

import model.Candidato
import repository.CandidatoRepository
import repository.CompetenciaRepository
import view.CandidatoView

class CandidatoController {
    CandidatoView view
    CandidatoRepository list

    CandidatoController(CandidatoRepository listaDeCandidatos) {
        list = listaDeCandidatos
    }

    CandidatoController(CandidatoRepository listaDeCandidatos, CandidatoView  candidatoView) {
        list = listaDeCandidatos
        view = candidatoView
    }

    void listarCandidatos() {
        view.exibirListaDeCandidatos(list.candidatos)
    }

    def buscarDadosCandidato() {
        def input = view.criarCandidato()
        Candidato candidato = new Candidato()
        candidato.nome = input.nome
        candidato.idade = input.idade
        candidato.cpf = input.cpf
        candidato.email = input.email
        candidato.estado = input.estado
        candidato.cep = input.cep
        candidato.descricao = input.descricao
        candidato.competencias = (new CompetenciaRepository()).getCompetencias(input.competencias) // isso funciona enquanto é fixa a lista de competencias

        cadastrarCandidato(candidato)

        return candidato
    }

    void exibirNovoCandidato(Candidato candidato) {
        println "\n----------- CANDIDATO CRIADO COM SUCESSO -----------"
        view.exibirCandidato(candidato)
    }

    void cadastrarCandidato(Candidato novoCandidato) {
        if (novoCandidato.nome == null || novoCandidato.nome.trim().isEmpty()) {
            println "Erro: o nome é obrigatório"
            return
        }

        if (novoCandidato.email == null || novoCandidato.email.trim().isEmpty()) {
            println "Erro: o email é obrigatório"
            return
        } else if (!novoCandidato.email.contains("@")) {
            println "Erro: email inválido"
            return
        }

        if (novoCandidato.cpf == null || novoCandidato.cpf.trim().isEmpty()) {
            println "Erro: o cpf é obrigatório"
            return
        } else if (novoCandidato.cpf.size() != 11) {
            println "Erro: cpf inválido"
            return
        }

        list.addCandidato(novoCandidato)
    }
}