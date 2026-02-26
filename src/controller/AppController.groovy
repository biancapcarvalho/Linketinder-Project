package controller

import view.MenuView

class AppController {
    MenuView view
    CandidatoController candidatoController
    EmpresaController empresaController

    void iniciar() {
        view.exibirIntro()

        boolean executando = true
        Scanner scanner = new Scanner(System.in)

        while (executando) {
            view.exibirMenu()
            Integer input = 0
            try {
                input = scanner.nextLine() as Integer
            } catch (NumberFormatException e) {
                println "Não consegui entender. Você deve informar um número do menu"
                continue
            }

            switch (input) {
                case 1:
                    candidatoController.listarCandidatos()
                    break
                case 2:
                    def candidato = candidatoController.criarCandidato()
                    candidatoController.exibirNovoCandidato(candidato)
                    break
                case 3:
                    empresaController.listarEmpresas()
                    break
                case 4:
                    def empresa = empresaController.criarEmpresa()
                    empresaController.exibirNovaEmpresa(empresa)
                    break
                case 5:
                    executando = false
                    break
                default:
                    println "Não consegui entender. Você deve informar um número do menu"
            }
        }
    }
}