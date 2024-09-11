package controller;

import model.Companion;
import model.Modulo;
import service.CompanionService;
import service.CompanionServiceImpl;
import service.Service;
import service.Status;

import java.util.List;

public class CompanionControllerImpl implements CompanionController{
    CompanionService service;

    public CompanionControllerImpl(CompanionServiceImpl service){
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
        return this.service.excluir(companion);
    }

    @Override
    public List<Companion> getList() {
        return service.getList();
    }

    @Override
    public Status adicionarModulo(Modulo m, Companion c) {
        return this.service.adicionarModulo(m, c);
    }
    //CRUD
}
