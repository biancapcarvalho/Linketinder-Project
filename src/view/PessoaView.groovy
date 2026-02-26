package view

import model.Competencia
import model.CompetenciaList

abstract class PessoaView {

    String getInputNome(Scanner scanner) {
        boolean inputValido = false
        String input = ""

        while (!inputValido) {
            print "# Nome completo: "
            input = scanner.nextLine()

            if (input.trim() != "") {
                inputValido = true
                input = input.trim()
            } else {
                println "É obrigatório informar um nome"
            }
        }

        input
    }

    abstract String getInputDocumento(Scanner scanner)

    String getInputEmail(Scanner scanner) {
        boolean inputValido = false
        String input = ""

        while (!inputValido) {
            print "# Endereço de email: "
            input = scanner.nextLine()

            if (input.trim() != "") {
                if (input.contains("@")) { // tentar com regex
                    inputValido = true
                    input = input.trim()
                } else {
                    println "Email inválido"
                }
            } else {
                println "É obrigatório informar um email"
            }
        }

        input
    }

    String getInputEstado(Scanner scanner) {
        boolean inputValido = false
        String input = ""

        while (!inputValido) {
            print "# Estado: "
            input = scanner.nextLine()

            if (input.trim() != "") {
                inputValido = true
                input = input.trim()
            } else {
                println "É obrigatório informar um estado"
            }
        }

        input
    }

    String getInputCep(Scanner scanner) {
        boolean inputValido = false
        String input = ""

        while (!inputValido) {
            print "# CEP (somente números): "
            input = scanner.nextLine()

            if (input.trim() != "") {
                if (input.trim().size() == 8) { // pesquisar por validador de cep
                    inputValido = true
                } else {
                    println "CEP inválido"
                }
            } else {
                println "É obrigatório informar o CEP"
            }
        }

        input
    }

    String getInputDescricao(Scanner scanner) {
        print "# Descrição: "
        scanner.nextLine().trim()
    }

    Set<Integer> getInputCompetencias(Scanner scanner) {
        println("Informe suas competências:")
        CompetenciaList list = new CompetenciaList()
        list.competencias.each { c ->
            println "$c.id - $c.nome"
        }
        print "Informe os números das competências separados por vírgula: "
        String input = scanner.nextLine()

        Set<Integer> idsCompetencias = input.split(",").findResults {
            it.trim().isInteger() ? (it.trim() as Integer) : null
        } as Set // [1,2,3,4,50,null]

        idsCompetencias
    }
}
