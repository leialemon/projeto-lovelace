package service;

import model.Companion;
import repository.RepositorioCompanion;
import repository.RepositorioModulo;
import repository.RepositorioQuestoes;
import repository.RepositorioTema;

import java.util.List;

public class CompanionServiceInst implements Service<Companion>, CompanionService {
    RepositorioCompanion repositorioCompanion;

    public CompanionServiceInst(RepositorioCompanion repositorioCompanion){
        this.repositorioCompanion = repositorioCompanion;
    }
    @Override
    public Status criar(Companion c){
        return this.repositorioCompanion.adicionar(c);
    }

    @Override
    public void excluir(Companion c) {}

    @Override
    public void editar(Companion c) {}

    @Override
    public Companion mostrar(Companion c) {
        return null;}

    @Override
    public List<Companion> getList() {
        return this.repositorioCompanion.getList();
    }
}
