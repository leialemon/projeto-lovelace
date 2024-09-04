package service;

import repository.Repositorio;

import java.util.List;

public class CompanionService implements Service{
    private Repositorio repositorioCompanion;
    private Repositorio repositorioModulo;
    public CompanionService(Repositorio repositorioCompanion, Repositorio repositorioModulo){
        this.repositorioCompanion = repositorioCompanion;
        this.repositorioModulo = repositorioModulo;
    }
}
