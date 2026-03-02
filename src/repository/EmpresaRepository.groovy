package repository

import model.Empresa

class EmpresaRepository {
    List<Empresa> empresas = []

    EmpresaRepository(CompetenciaRepository competencias) {
        empresas.add(
                new Empresa(
                        nome: "Tech Inovações S/A",
                        email: "vagas@techinovacoes.com",
                        cnpj: "11.111.111/0001-11",
                        pais: "Brasil",
                        estado: "SP",
                        cep: "01310-200",
                        descricao: "Consultoria focada em arquitetura de microsserviços.",
                        competencias: competencias.getCompetencias(["Java", "Spring", "Docker"])
                )
        )
        empresas.add(
                new Empresa(
                        nome: "AgroData Solutions",
                        email: "rh@agrodata.com.br",
                        cnpj: "22.222.222/0001-22",
                        pais: "Brasil",
                        estado: "GO",
                        cep: "74000-100",
                        descricao: "Buscando otimizar o agronegócio com análise de dados.",
                        competencias: competencias.getCompetencias(["PostgreSQL", "Java", "Linux"])
                )
        )
        empresas.add(
                new Empresa(
                        nome: "WebFront Studio",
                        email: "talentos@webfront.io",
                        cnpj: "33.333.333/0001-33",
                        pais: "Brasil",
                        estado: "MG",
                        cep: "30130-000",
                        descricao: "Agência criativa especializada em interfaces modernas.",
                        competencias: competencias.getCompetencias(["JavaScript", "TypeScript", "Angular"])
                )
        )
        empresas.add(
                new Empresa(
                        nome: "DevOps Masters",
                        email: "jobs@devopsmasters.com",
                        cnpj: "44.444.444/0001-44",
                        pais: "Brasil",
                        estado: "SC",
                        cep: "88010-000",
                        descricao: "Empresa referência em infraestrutura e automação.",
                        competencias: competencias.getCompetencias(["Linux", "Docker", "Git"])
                )
        )
        empresas.add(
                new Empresa(
                        nome: "Code Quality Labs",
                        email: "contato@cqlabs.dev",
                        cnpj: "55.555.555/0001-55",
                        pais: "Brasil",
                        estado: "PR",
                        cep: "80020-000",
                        descricao: "Focados em testes automatizados e qualidade de software.",
                        competencias: competencias.getCompetencias(["Groovy", "JUnit", "Java"])
                )
        )
    }

    void addEmpresa(Empresa empresa) {
        empresas.add(empresa)
    }
}
