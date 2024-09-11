package controller;

import model.Companion;
import service.CompanionService;
import service.CompanionServiceInst;
import service.Service;
import service.Status;

import java.util.List;

public class CompanionController implements Controller<Companion>{
    Service<Companion> service;

    public CompanionController(CompanionServiceInst service){
        this.service = service;
    }

    @Override
    public Status criar(Companion companion) {
        if (companion.getNome() == null){
            return Status.NOME_NULO;
        } else if (companion.getSenha() == null) {
            return Status.SENHA_NULA;
        }
        return this.service.criar(companion);
    }

    @Override
    public Status apagar(Companion companion) {
        return null;
    }

    @Override
    public List<Companion> getList() {
        return service.getList();
    }
    //CRUD
}
