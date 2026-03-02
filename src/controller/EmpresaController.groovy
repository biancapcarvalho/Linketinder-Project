package controller

import repository.EmpresaRepository
import view.EmpresaView

class EmpresaController {
    EmpresaView view
    EmpresaRepository list

    void listarEmpresas() {
        view.exibirListaDeEmpresas(list.empresas)
    }
}
