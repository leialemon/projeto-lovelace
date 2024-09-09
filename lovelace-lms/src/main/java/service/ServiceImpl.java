package service;

import repository.Repositorio;
import repository.RepositorioCompanion;
import repository.RepositorioModulo;
import repository.RepositorioQuestoes;
import repository.RepositorioTema;

public abstract class ServiceImpl<T> implements Service<T>{
    protected RepositorioCompanion bancoCompanions;
    protected RepositorioModulo bancoModulos;
    protected RepositorioTema bancoTemas;
    protected RepositorioQuestoes bancoQuestoes;

    @Override
    public void setRepositorio(RepositorioCompanion repositorio) {
        this.bancoCompanions = repositorio;
    }

    public void setRepositorio(RepositorioModulo repositorio){
        this.bancoModulos = repositorio;
    }

    public void setRepositorio(RepositorioTema repositorio){
        this.bancoTemas = repositorio;
    }

    public void setRepositorio(RepositorioQuestoes repositorio){
        this.bancoQuestoes = repositorio;
    }

    public RepositorioCompanion getRepositorioCompanion(){
        return this.bancoCompanions;
    }

    public RepositorioModulo getRepositorioModulo(){
        return this.bancoModulos;
    }

    public RepositorioTema getRepositorioTema(){
        return this.bancoTemas;
    }

    public RepositorioQuestoes getRepositorioQuestoes(){
        return this.bancoQuestoes;
    }

    @Override
    public void criar(Repositorio<T> repo, T t) {
       
    }

    @Override
    public void excluir(Repositorio<T> repo, T t) {
        if (t != null){
            repo.apagar(t);
        }
    }

    @Override
    public void editar(Repositorio<T> repo, T t) {
        if (t != null){
            repo.editar(t);
        }
    }

    @Override
    public void mostrar(Repositorio<T> repo, T t) {
        if (t != null){
            repo.buscar(t);
        }
    }
    
}
