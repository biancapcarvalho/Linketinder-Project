package controller

import model.Candidato
import model.CompetenciaList
import model.Empresa
import model.EmpresaList
import view.EmpresaView

class EmpresaController {
    EmpresaView view
    EmpresaList list

    void listarEmpresas() {
        view.exibirListaDeEmpresas(list.empresas)
    }
}
