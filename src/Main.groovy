import controller.AppController
import controller.CandidatoController
import controller.EmpresaController
import repository.CandidatoRepository
import repository.CompetenciaRepository
import repository.EmpresaRepository
import view.CandidatoView
import view.EmpresaView
import view.MenuView

class Main {
    static void main(String[] args) {
        CompetenciaRepository competenciaList = new CompetenciaRepository()

        CandidatoRepository candidatoList = new CandidatoRepository(competenciaList)
        CandidatoView candidatoView = new CandidatoView()
        CandidatoController candidatoController = new CandidatoController(candidatoList, candidatoView)

        EmpresaRepository empresaList = new EmpresaRepository(competenciaList)
        EmpresaView empresaView = new EmpresaView()
        EmpresaController empresaController = new EmpresaController(list: empresaList, view: empresaView)

        MenuView menuView = new MenuView()
        AppController app = new AppController(view: menuView, candidatoController: candidatoController, empresaController: empresaController)

        app.iniciar()
    }
}