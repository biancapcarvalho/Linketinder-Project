package view

import model.Competencia
import model.Empresa

class EmpresaView {
    void exibirListaDeEmpresas(List<Empresa> empresas) {
        println "\n------------- LISTA DE EMPRESAS ------------"
        if (!empresas) {
            println "Nenhuma empresa cadastrada"
            return
        }

        empresas.each {exibirEmpresa(it)}
    }

    void exibirEmpresa(Empresa e) {
        String nome  = e.nome.toUpperCase()
        println "## $nome"
        println "  --> CNPJ: $e.cnpj, E-mail: $e.email"
        println "  --> Pais: $e.pais, Estado: $e.estado, CEP: $e.cep"
        println "  --> Descrição: $e.descricao"
        print "  --> Competências: "
        exibirCompetencias(e.competencias)
        println "\n"
    }

    void exibirCompetencias(List<Competencia> competencias) {
        competencias.each { print "$it.nome "}
    }
}
