package service;

import model.Companion;
import repository.Repositorio;
import repository.RepositorioCompanion;


public class CompanionService implements Service<Companion>{
    private Repositorio<Companion> repositorioCompanion;

    public CompanionService(RepositorioCompanion repo, Companion compAtivo){
        this.setRepositorio(repo);
    }

    public void setRepositorio(Repositorio<Companion> repositorio){
        this.repositorioCompanion = repositorio;
    }
    public void criar(Companion c){
        if (c != null){
            repositorioCompanion.adicionar(c);
        }
    };
    public void excluir(Companion c){if (c != null){
        repositorioCompanion.apagar(c);
    }};
    public void editar(Companion c){
        if (c != null){
            repositorioCompanion.editar(c);
        }
    };
    public void mostrar(Companion c){
        if (c != null){
            repositorioCompanion.buscar(c);
        }
    };
}

