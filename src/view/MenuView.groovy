package view

class MenuView {
    void exibirIntro() {
        println "Bem-vindo ao LinkeTinder"
    }

    def exibirMenu() {
        println "\n-------------------- MENU --------------------"
        println "1 - Listar todos os candidatos"
        println "2 - Listar todas as empresas"
        println "3 - Sair"
        print "> Escolha uma opção: "
    }
}