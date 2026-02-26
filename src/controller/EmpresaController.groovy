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

    def criarEmpresa() {
        def input = view.criarEmpresa()
        Empresa empresa = new Empresa()
        empresa.nome = input.nome
        empresa.cnpj = input.cnpj
        empresa.email = input.email
        empresa.estado = input.estado
        empresa.pais = input.pais
        empresa.cep = input.cep
        empresa.descricao = input.descricao
        empresa.competencias = (new CompetenciaList()).getCompetencias(input.competencias) // isso funciona enquanto é fixa a lista de competencias

        list.empresas.add(empresa)

        return empresa
    }

    void exibirNovaEmpresa(Empresa empresa) {
        println "\n----------- EMPRESA CRIADA COM SUCESSO -----------"
        view.exibirEmpresa(empresa)
    }
}
