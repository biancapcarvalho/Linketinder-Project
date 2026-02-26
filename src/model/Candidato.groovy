package model

import groovy.transform.ToString

@ToString
class Candidato extends Pessoa {
    String cpf
    int idade
}
