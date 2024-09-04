package service;

import model.Companion;
import repository.Repositorio;

import java.util.List;

public class CompanionService implements Service{
    private Repositorio repositorioCompanion;
    private Repositorio repositorioModulo;
    public CompanionService(Repositorio repositorioCompanion, Repositorio repositorioModulo, Companion companionAtivo){
        this.repositorioCompanion = repositorioCompanion;
        this.repositorioModulo = repositorioModulo;
    }
}
