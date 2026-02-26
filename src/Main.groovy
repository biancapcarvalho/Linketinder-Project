import controller.AppController
import controller.CandidatoController
import controller.EmpresaController
import model.CandidatoList
import model.CompetenciaList
import model.EmpresaList
import view.CandidatoView
import view.EmpresaView
import view.MenuView

class Main {
    static void main(String[] args) {
        CompetenciaList competenciaList = new CompetenciaList()

        CandidatoList candidatoList = new CandidatoList(competenciaList)
        CandidatoView candidatoView = new CandidatoView()
        CandidatoController candidatoController = new CandidatoController(list: candidatoList, view: candidatoView)

        EmpresaList empresaList = new EmpresaList(competenciaList)
        EmpresaView empresaView = new EmpresaView()
        EmpresaController empresaController = new EmpresaController(list: empresaList, view: empresaView)

        MenuView menuView = new MenuView()
        AppController app = new AppController(view: menuView, candidatoController: candidatoController, empresaController: empresaController)

        app.iniciar()
    }
}