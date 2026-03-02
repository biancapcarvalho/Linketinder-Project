package controller

import model.Empresa
import model.Competencia
import model.Pessoa
import repository.EmpresaRepository
import spock.lang.Specification

class EmpresaControllerSpec extends Specification {
    EmpresaRepository repositoryMock
    EmpresaController controller

    def setup() {
        repositoryMock = Mock(EmpresaRepository)
        controller = new EmpresaController(repositoryMock)
    }

    def "cadastrado com sucesso"() {
        given: "arrange/setup"
        Pessoa novaEmpresa = new Empresa(
                nome: "TechTech",
                email: "rh@ttech.com",
                cnpj: "12312312312123",
                cep: "12123123",
                estado: "Goiás",
                pais: "Brasil",
                descricao: "Servidores",
                competencias: [
                        new Competencia(id: 10, nome: "Linux"),
                        new Competencia(id: 11, nome: "Docker")
                ]
        )

        when: "act/execucao"
        controller.cadastrarEmpresa(novaEmpresa)

        then: "assert/validacao"
        1 * repositoryMock.addEmpresa(novaEmpresa)
    }

    def "erro: cadastro sem nome ou email"() {
        given:
        Pessoa novaEmpresa = new Empresa(
                nome: nome,
                email: email,
                cnpj: cnpj,
                cep: "12123123",
                estado: "Goiás",
                pais: "Brasil",
                descricao: "Servidores",
                competencias: [
                        new Competencia(id: 10, nome: "Linux"),
                        new Competencia(id: 11, nome: "Docker")
                ]
        )
        when: "act/execucao"
        controller.cadastrarEmpresa(novaEmpresa)

        then: "assert/validacao"
        0 * repositoryMock.addEmpresa(novaEmpresa)

        where: "os cenários inválidos são"
        nome       | email             | cnpj
        ""         | "rh@ttech.com"    | "12312312312123"
        null       | "rh@ttech.com"    | "12312312312123"
        "TechTech" | ""                | "12312312312123"
        "TechTech" | null              | "12312312312133"
        "TechTech" | "emailsemarroba"  | "12312312312123"
        "TechTech" | "rh@ttech.com"    | null
        "TechTech" | "rh@ttech.com"    | ""
        "TechTech" | "rh@ttech.com"    | "123123"
    }
}
