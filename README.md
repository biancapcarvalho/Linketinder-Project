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

E para a implementação dos testes unitários foi utilizado o Spock.

## Funcionalidades

#### O projeto está em sua implementação básica:

-[x] Candidatos com os atributos Nome, E-mail, CPF, idade, Estado, CEP, descrição e competências
-[x] 5 candidatos pré-cadastrados
-[x] Competências pré-definidas: PostgreSQL, Java, Spring, Angular, Groovy, JUnit, JavaScript, TypeScript, Git, Linux e Docker
-[x] Empresa com os atributos Nome, E-mail Corporativo, CNPJ, País, Estado, CEP e Descrição e competências
-[x] 5 empresas pré-cadastrados
-[x] Permitir cadastrar candidatos
-[x] Permitir cadastrar empresas
-[x] Menu simples no terminal
  - [x] Listar candidatos
  - [x] Cadastrar candidatos
  - [x] Listar empresas
  - [x] Cadastrar empresas
  - [x] Sair
   
#### E futuramente serão implementados:

-[ ] Vagas
-[ ] Sistema de match

#### Implementação dos testes

O projeto ZG Hero da trilha de testes unitários pede que seja implementada a funcionalidade de cadastro (de empresaa e de candidato) usando o TDD:
> --> implementar o teste --> implementar a funcionalidade --> melhorar a funcionalidade

Como eu já havia implementado o cadastro, mas ainda não tinha feito/subido uma release com essa funcionalidade, criei uma branch a partir da main, ou seja, sem a funcionalidade de cadastro, e iniciei o ZG Hero K1-T5 a partir daí, criando o teste e depois a funcionalidade

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