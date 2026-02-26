package model

class CandidatoList {
    List<Candidato> candidatos = []

    CandidatoList(CompetenciaList competencias) {
        candidatos.add(
                new Candidato(
                        nome: "Bianca Carvalho",
                        email: "caarvalhobianca@gmail.com",
                        cpf: "123.456.789-12",
                        idade: 25,
                        estado: "GO",
                        cep: "74000-000",
                        descricao: "Desenvolvedora Full-Stack",
                        competencias: competencias.getCompetencias(["TypeScript", "JavaScript", "Groovy"])
                )
        )
        candidatos.add(
                new Candidato(
                        nome: "Lucas Mendes",
                        email: "lucas.mendes@email.com",
                        cpf: "111.222.333-44",
                        idade: 22,
                        estado: "GO",
                        cep: "74001-000",
                        descricao: "Desenvolvedor Backend com foco em microsserviços",
                        competencias: competencias.getCompetencias(["Java", "Spring", "Git"])
                )
        )
        candidatos.add(
                new Candidato(
                        nome: "Mariana Costa",
                        email: "mari.costa@email.com",
                        cpf: "555.666.777-88",
                        idade: 26,
                        estado: "SP",
                        cep: "01310-100",
                        descricao: "Engenheira de Software apaixonada por automação",
                        competencias: competencias.getCompetencias(["Linux", "Docker"])
                )
        )
        candidatos.add(
                new Candidato(
                        nome: "Pedro Rocha",
                        email: "pedro.rocha@email.com",
                        cpf: "101.202.303-40",
                        idade: 27,
                        estado: "RJ",
                        cep: "20021-120",
                        descricao: "Desenvolvedor Full-Stack focado em performance",
                        competencias: competencias.getCompetencias(["Java", "Angular", "PostgreSQL"])
                )
        )
        candidatos.add(
                new Candidato(
                        nome: "Aline Silva",
                        email: "aline.silva@email.com",
                        cpf: "444.333.222-11",
                        idade: 24,
                        estado: "MG",
                        cep: "30130-000",
                        descricao: "Desenvolvedora Frontend criativa e detalhista",
                        competencias: competencias.getCompetencias(["Angular", "TypeScript"])
                )
        )
    }
}
