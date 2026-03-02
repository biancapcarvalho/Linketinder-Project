package controller

import model.Empresa
import repository.CompetenciaRepository
import repository.EmpresaRepository
import view.EmpresaView

class EmpresaController {
    EmpresaView view
    EmpresaRepository list

    EmpresaController(EmpresaRepository listaDeEmpresas) {
        list = listaDeEmpresas
    }

    EmpresaController(EmpresaRepository listaDeEmpresas, EmpresaView  empresaView) {
        list = listaDeEmpresas
        view = empresaView
    }

    void listarEmpresas() {
        view.exibirListaDeEmpresas(list.empresas)
    }

    def buscarDadosEmpresa() {
        def input = view.criarEmpresa()
        Empresa empresa = new Empresa()
        empresa.nome = input.nome
        empresa.cnpj = input.cnpj
        empresa.email = input.email
        empresa.estado = input.estado
        empresa.pais = input.pais
        empresa.cep = input.cep
        empresa.descricao = input.descricao
        empresa.competencias = (new CompetenciaRepository()).getCompetencias(input.competencias) // isso funciona enquanto é fixa a lista de competencias

        cadastrarEmpresa(empresa)

        return empresa
    }

    void exibirNovaEmpresa(Empresa empresa) {
        println "\n----------- EMPRESA CRIADA COM SUCESSO -----------"
        view.exibirEmpresa(empresa)
    }

    void cadastrarEmpresa(Empresa novaEmpresa) {
        if (novaEmpresa.nome == null || novaEmpresa.nome.trim().isEmpty()) {
            println "Erro: o nome é obrigatório"
            return
        }

        if (novaEmpresa.email == null || novaEmpresa.email.trim().isEmpty()) {
            println "Erro: o email é obrigatório"
            return
        } else if (!novaEmpresa.email.contains("@")) {
            println "Erro: email inválido"
            return
        }

        if (novaEmpresa.cnpj == null || novaEmpresa.cnpj.trim().isEmpty()) {
            println "Erro: o cnpj é obrigatório"
            return
        } else if (novaEmpresa.cnpj.size() != 14) {
            println "Erro: cnpj inválido"
            return
        }

        list.addEmpresa(novaEmpresa)
    }
}
