package service;

import model.Questao;
import repository.RepositorioQuestoes;

import java.util.List;

public class QuestaoServiceInst implements Service<Questao>, QuestaoService{
    RepositorioQuestoes repositorioQuestoes;
    public QuestaoServiceInst(RepositorioQuestoes repositorioQuestoes){
        this.repositorioQuestoes = repositorioQuestoes;
    }

    @Override
    public Status criar(Questao questao) {
        return null;
    }

    @Override
    public void excluir(Questao questao) {

    }

    @Override
    public void editar(Questao questao) {

    }

    @Override
    public Questao mostrar(Questao questao) {
        return null;
    }

    @Override
    public List<Questao> getList() {
        return this.repositorioQuestoes.getList();
    }
}
