package service;
import model.Companion;
import model.Modulo;
import model.Questao;
import model.Tema;
import repository.*;

import java.util.List;

public class ServiceImpl<T> implements Service<T>{
    protected RepositorioCompanion repoCompanion;
    protected RepositorioModulo repoModulo;
    protected RepositorioTema repoTema;
    protected RepositorioQuestoes repoQuestao;

    private CompanionServiceImpl companionService;
    private QuestaoServiceImpl questaoService;

    public ServiceImpl() {
        repoCompanion = new RepositorioCompanion();
        repoModulo = new RepositorioModulo();
        repoTema = new RepositorioTema();
        repoQuestao = new RepositorioQuestoes();

        companionService = new CompanionServiceImpl();
        questaoService = new QuestaoServiceImpl();
    }

    public CompanionServiceImpl getCompanionService(){
        return this.companionService;
    }

    public QuestaoServiceImpl getQuestaoService(){
        return this.questaoService;
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

    public Status criar(T t) {
        return Status.TUDO_CERTO;}
    public void excluir(T t) {}
    public void editar(T t) {}
    public T mostrar(T t) {
        return null;}
}
