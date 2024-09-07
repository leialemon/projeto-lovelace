package service;

import repository.Repositorio;
import repository.RepositorioModulo;
import model.Modulo;

public class ModuloService implements Service<Modulo>{
    private Repositorio<Modulo> repositorioModulo = new RepositorioModulo();
    
    public ModuloService(RepositorioModulo repo){
        this.setRepositorio(repo);
    }

    public void setRepositorio(Repositorio<Modulo> repositorio){
        this.repositorioModulo = repositorio;
    }

    public void criar(Modulo m){};
    public void excluir(Modulo m){};
    public void editar(Modulo m){};
    public void mostrar(Modulo m){};
}
