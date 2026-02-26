# LinkeTinder
_**Desenvolvido por Bianca Carvalho**_

---

## Sobre o Projeto
O LinkeTinnder é um sistema de contratação de funcionários inspirado no Linkedin e no Tinder. Seu objetivo é melhorar o filtro de candidatos de forma que um candidato não tenha mais visibilidade com outro devido a curtidas e uso de palavras chave de destaque como no linkedin; e também usar o formato de match do tinder para candidatos e vagas/oportunidades.

Como um MVP, o projeto conta atualmente com 5 empresas e 5 candidatos pré-cadastrados com dados básicos (nome, email, localização, etc) e também dados referentes ao curriculo/atuação (uma descrição e competências).
A lista de competências é pré-definida, ou seja, candidatos e empresas escolhem as competências dessa lista: o candidato escolhe suas skills dessa lista, e a empresa escolhe as skills dessa lista que ela quer que seu futuro funcionário tenha.

O projeto está sendo desenvolvido em Groovy e sem uso de frameworks
```bash
bianca@bianca-ubuntu-vm:~/IdeaProjects/Linketinder-Project$ groovy --version
Groovy Version: 5.0.4 JVM: 17.0.18 Vendor: Eclipse Adoptium OS: Linux
```

## Sobre a implementação

O projeto está em sua implementação básica:

-[x] Candidatos com os atributos Nome, E-mail, CPF, idade, Estado, CEP, descrição e competências
-[x] 5 candidatos pré-cadastrados
-[x] Competências pré-definidas: PostgreSQL, Java, Spring, Angular, Groovy, JUnit, JavaScript, TypeScript, Git, Linux e Docker
-[x] Empresa com os atributos Nome, E-mail Corporativo, CNPJ, País, Estado, CEP e Descrição e competências
-[x] 5 empresas pré-cadastrados
-[x] Menu simples no terminal
  - [x] Listar candidatos
  - [x] Listar empresas
  - [x] Sair
   
E futuramente serão implementados:

-[ ] Permitir cadastrar candidatos
-[ ] Permitir cadastrar empresas
-[ ] Novo menu
  - [ ] Menu principal (logar, cadastrar, sair)
  - [ ] Menu de cadastro (cadastrar como empresa ou candidato, voltar e sair)
  - [ ] Menu de login (logar como empresa ou candidato, voltar e sair)
    - [ ] Implementar forma de autenticação
  - [ ] Menu do candidato (ver empresas, curtir empresa, sair)
  - [ ] Menu da empresa (ver candidatos, curtir candidato, sair)

## Como executar o projeto via terminal
1. Clonar este repositório
```bash
git clone https://github.com/biancapcarvalho/Linketinder-Project.git 
```
2. Compilar
```bash
cd Linketinder-Project/src
groovyc Main.groovy
```
3. Executar
```bash
groovy Main
```