package model

import groovy.transform.ToString

@ToString
class Empresa extends Pessoa {
    String cnpj, pais
}