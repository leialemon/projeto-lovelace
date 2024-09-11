package controller;

import model.Modulo;
import model.Tema;
import service.ModuloService;
import service.ModuloServiceImpl;
import service.Status;

import java.util.List;

public class ModuloControllerImpl implements ModuloController{
    ModuloService service;

    public ModuloControllerImpl(ModuloServiceImpl service){
        this.service = service;
    }

    @Override
    public Status criar(Modulo modulo) {
        return service.criar(modulo);
    }

    @Override
    public Status apagar(Modulo modulo) {
        return service.excluir(modulo);
    }

    @Override
    public List<Modulo> getList() {
        return service.getList();
    }

    @Override
    public Status adicionarTema(Modulo m, Tema t) {
        for (Tema tema : m.getTemas()){
            if (t.equals(tema)){
                return Status.JA_EXISTE;
            }
        }
        this.service.adicionarTema(m, t);
        return Status.TUDO_CERTO;
    }
}
