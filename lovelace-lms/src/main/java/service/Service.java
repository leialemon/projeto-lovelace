package service;

import repository.Repositorio;
import repository.RepositorioCompanion;
import repository.RepositorioModulo;
import repository.RepositorioQuestoes;
import repository.RepositorioTema;


public interface Service<T>{
    // Overloading dos métodos setters de Repositorio para criar todos os repositórios necessários em ServiceImpl
    public void setRepositorio(RepositorioCompanion repositorio);
    public void setRepositorio(RepositorioModulo repositorio);
    public void setRepositorio(RepositorioTema repositorio);
    public void setRepositorio(RepositorioQuestoes repositorio);

    public RepositorioCompanion getRepositorioCompanion();
    public RepositorioModulo getRepositorioModulo();
    public RepositorioTema getRepositorioTema();
    public RepositorioQuestoes getRepositorioQuestoes();

    //Métodos CRUD generics
    public void criar(Repositorio<T> repo, T t);
    public void excluir(Repositorio<T> repo, T t);
    public void editar(Repositorio<T> repo, T t);
    public void mostrar(Repositorio<T> repo, T t);
    
}
