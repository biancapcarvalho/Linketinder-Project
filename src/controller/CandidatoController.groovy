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
}
