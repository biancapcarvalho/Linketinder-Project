package view

import model.Competencia
import model.Empresa

class EmpresaView extends PessoaView {
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

    def criarEmpresa() {
        Scanner scanner = new Scanner(System.in)

        println "\n------------- CADASTRAR NOVA EMPRESA ------------"

        println "### Dados da pessoa jurídica"
        String nome = getInputNome(scanner)
        String documento = getInputDocumento(scanner)
        String email = getInputEmail(scanner)

        println "### Dados de localização"
        String estado = getInputEstado(scanner)
        String pais = getInputPais(scanner)
        String cep = getInputCep(scanner)

        println "### Dados para recrutamento"
        String descricao = getInputDescricao(scanner)
        Set<Integer> competencias = getInputCompetencias(scanner).sort()

        return [
                nome: nome,
                cnpj: documento,
                email: email,
                estado: estado,
                pais: pais,
                cep: cep,
                descricao: descricao,
                competencias: competencias
        ]
    }

    String getInputPais(Scanner scanner) {
        boolean inputValido = false
        String input = ""

        while (!inputValido) {
            print "# País: "
            input = scanner.nextLine()

            if (input.trim() != "") {
                inputValido = true
                input = input.trim()
            } else {
                println "É obrigatório informar um país"
            }
        }

        input
    }

    @Override
    String getInputDocumento(Scanner scanner) {
        boolean inputValido = false
        String input = ""

        while (!inputValido) {
            print "# CNPJ (somente números): "
            input = scanner.nextLine()

            if (input.trim() != "") {
                if (input.trim().size() == 14) {
                    inputValido = true
                    input = input.trim()
                } else {
                    println "CNPJ inválido"
                }
            } else {
                println "É obrigatório informar o CNPJ"
            }
        }

        input
    }
}
