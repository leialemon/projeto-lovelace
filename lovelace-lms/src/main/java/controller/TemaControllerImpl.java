package controller;

import model.Exercicio;
import model.Tema;
import service.Status;
import service.TemaService;
import service.TemaServiceImpl;

import java.util.List;

public class TemaControllerImpl implements TemaController {
    TemaService service;

    public TemaControllerImpl(TemaServiceImpl service) {
        this.service = service;
    }

    @Override
    public Status criar(Tema tema) {
        return this.service.criar(tema);
    }

    @Override
    public Status apagar(Tema tema) {
        return this.service.excluir(tema);
    }

    @Override
    public List<Tema> getList() {
        return service.getList();
    }

    @Override
    public Status adicionarExercicio(Tema tema, Exercicio exercicio) {
        this.service.adicionarExercicio(tema, exercicio);
        return Status.TUDO_CERTO;
    }
}