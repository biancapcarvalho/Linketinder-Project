package view

import model.Candidato
import model.Competencia

class CandidatoView extends PessoaView {
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

    def criarCandidato() {
        Scanner scanner = new Scanner(System.in)

        println "\n------------- CADASTRAR NOVO CANDIDATO ------------"

        println "### Dados pessoais"
        String nome = getInputNome(scanner)
        Integer idade = getInputIdade(scanner)
        String documento = getInputDocumento(scanner)
        String email = getInputEmail(scanner)

        println "### Dados de localização"
        String estado = getInputEstado(scanner)
        String cep = getInputCep(scanner)

        println "### Dados do currículo"
        String descricao = getInputDescricao(scanner)
        Set<Integer> competencias = getInputCompetencias(scanner).sort()

        return [
                nome: nome,
                idade: idade,
                cpf: documento,
                email: email,
                estado: estado,
                cep: cep,
                descricao: descricao,
                competencias: competencias
        ]
    }

    @Override
    String getInputDocumento(Scanner scanner) {
        boolean inputValido = false
        String input = ""

        while (!inputValido) {
            print "# CPF (somente números): "
            input = scanner.nextLine()

            if (input.trim() != "") {
                if (input.trim().size() == 11) {
                    inputValido = true
                    input = input.trim()
                } else {
                    println "CPF inválido"
                }
            } else {
                println "É obrigatório informar o CPF"
            }
        }

        input
    }

    Integer getInputIdade(Scanner scanner) {
        boolean inputValido = false
        Integer input = 0

        while (!inputValido) {
            print "# Idade (somente números): "
            try {
                input = scanner.nextLine().trim() as Integer
            } catch (NumberFormatException e) {
                println "Idade inválida"
                continue
            }
            inputValido = true
        }

        input
    }
}
