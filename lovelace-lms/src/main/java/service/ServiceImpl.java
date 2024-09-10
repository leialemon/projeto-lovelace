package service;
import model.Companion;
import model.Modulo;
import model.Questao;
import model.Tema;
import repository.*;

import java.util.List;

public class ServiceImpl<T> implements Service<T>{
    RepositorioCompanion repoCompanion;
    RepositorioModulo repoModulo;
    RepositorioTema repoTema;
    RepositorioQuestoes repoQuestao;

    public ServiceImpl() {
        repoCompanion = new RepositorioCompanion();
        repoModulo = new RepositorioModulo();
        repoTema = new RepositorioTema();
        repoQuestao = new RepositorioQuestoes();
    }

    public RepositorioCompanion getRepoCompanion(){
        return this.repoCompanion;
    }

    public List<Companion> getCompanions(){
        return this.repoCompanion.getList();
    }

    public List<Modulo> getModulos(){
        return this.repoModulo.getList();
    }

    public List<Tema> getTemas(){
        return this.repoTema.getList();
    }

    public List<Questao> getQuestoes(){
        return this.repoQuestao.getList();
    }

    public void criar(T t) {}
    public void excluir(T t) {}
    public void editar(T t) {}
    public T mostrar(T t) {
        return null;}
}
