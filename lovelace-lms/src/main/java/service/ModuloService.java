package service;

import repository.Repositorio;
import repository.RepositorioModulo;

public class ModuloService implements Service{
    private Repositorio repositorioModulo;
    public ModuloService(Repositorio repositorioModulo){
        this.repositorioModulo = repositorioModulo;
    }
}
