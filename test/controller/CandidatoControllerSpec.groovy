package controller

import model.Candidato
import repository.CandidatoRepository
import model.Competencia
import model.Pessoa
import spock.lang.Specification

class CandidatoControllerSpec extends Specification {
    CandidatoRepository repositoryMock
    CandidatoController controller

    def setup() {
        repositoryMock = Mock(CandidatoRepository)
        controller = new CandidatoController(repositoryMock)
    }

    def "cadastrado com sucesso"() {
        given: "arrange/setup"
        Pessoa novoCandidato = new Candidato(
                nome: "José",
                email: "jose@email.com",
                cpf: "12312312312",
                idade: 30,
                cep: "12123123",
                estado: "Goiás",
                descricao: "Desenvolvedor Frontend Junior",
                competencias: [
                        new Competencia(id: 7, nome: "JavaScript"),
                        new Competencia(id: 9, nome: "Git")
                ]
        )

        when: "act/execucao"
        controller.cadastrarCandidato(novoCandidato)

        then: "assert/validacao"
        1 * repositoryMock.addCandidato(novoCandidato)
    }

    def "erro: cadastro sem nome ou email"() {
        given:
        Pessoa novoCandidato = new Candidato(
                nome: nome,
                email: email,
                cpf: cpf,
                idade: 30,
                cep: "12123123",
                estado: "Goiás",
                descricao: "Desenvolvedor Frontend Junior",
                competencias: [
                        new Competencia(id: 7, nome: "JavaScript"),
                        new Competencia(id: 9, nome: "Git")
                ]
        )
        when: "act/execucao"
        controller.cadastrarCandidato(novoCandidato)

        then: "assert/validacao"
        0 * repositoryMock.addCandidato(novoCandidato)

        where: "os cenários inválidos são"
        nome   | email             | cpf
        ""     | "jose@email.com"  | "12312312312"
        null   | "jose@email.com"  | "12312312312"
        "José" | ""                | "12312312312"
        "José" | null              | "12312312312"
        "José" | "emailsemarroba"  | "12312312312"
        "Jośe" | "jose@email.com"  | null
        "Jośe" | "jose@email.com"  | ""
        "Jośe" | "jose@email.com"  | "123123"
    }
}
