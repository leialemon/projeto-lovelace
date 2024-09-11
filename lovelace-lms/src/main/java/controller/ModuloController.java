package controller;

import model.Modulo;
import service.ModuloService;
import service.Service;
import service.Status;

import java.util.List;

public class ModuloController implements  Controller<Modulo>{
    Service<Modulo> service;

    public ModuloController(ModuloService service){
        this.service = service;
    }

    @Override
    public Status criar(Modulo modulo) {
        return null;
    }

    @Override
    public Status apagar(Modulo modulo) {
        return null;
    }

    @Override
    public List<Modulo> getList() {
        return service.getList();
    }
}
