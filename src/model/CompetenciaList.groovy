package model

class CompetenciaList {
    ArrayList<Competencia> competencias = []

    CompetenciaList() {
        competencias.add(new Competencia(id: 1, nome: "PostgreSQL"))
        competencias.add(new Competencia(id: 2, nome: "Java"))
        competencias.add(new Competencia(id: 3, nome: "Spring"))
        competencias.add(new Competencia(id: 4, nome: "Angular"))
        competencias.add(new Competencia(id: 5, nome: "Groovy"))
        competencias.add(new Competencia(id: 6, nome: "JUnit"))
        competencias.add(new Competencia(id: 7, nome: "JavaScript"))
        competencias.add(new Competencia(id: 8, nome: "TypeScript"))
        competencias.add(new Competencia(id: 9, nome: "Git"))
        competencias.add(new Competencia(id: 10, nome: "Linux"))
        competencias.add(new Competencia(id: 11, nome: "Docker"))
    }

    Competencia getCompetencia(String nome) {
        competencias.find {it.nome == nome}
    }

    Competencia getCompetencia(int id) {
        competencias.find {it.id == id}
    }

    List<Competencia> getCompetencias(List<String> nomes) {
        nomes.collect { nome ->
            getCompetencia(nome)
        } as List<Competencia>
    }

    List<Competencia> getCompetencias(Set<Integer> ids) {
        ids.collect { id ->
            getCompetencia(id)
        } as List<Competencia>
    }
}