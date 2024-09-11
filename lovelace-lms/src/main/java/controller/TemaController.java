package controller;

import model.Tema;
import service.Service;
import service.Status;
import service.TemaService;

import java.util.List;

public class TemaController implements Controller<Tema> {
    Service<Tema> service;

    public TemaController(TemaService service) {
        this.service = service;
    }

    @Override
    public Status criar(Tema tema) {
        return null;
    }

    @Override
    public Status apagar(Tema tema) {
        return null;
    }

    @Override
    public List<Tema> getList() {
        return service.getList();
    }
}